package com.sct.model;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "complaints")
public class Complaint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false, length=150)
    private String title;

    @Column(nullable=false, length=1000)
    private String description;

    @Column(nullable=false, length=60)
    private String category;

    @Column(nullable=false, length=60)
    private String area;

    @Enumerated(EnumType.STRING)
    @Column(nullable=false, length=20)
    private ComplaintStatus status = ComplaintStatus.PENDING;

    @Column(nullable=false)
    private int urgency; // 1..5

    @Column(nullable=false, updatable=false)
    private Instant createdAt = Instant.now();

    @Column(nullable=false)
    private Instant updatedAt = Instant.now();

    @PreUpdate
    public void onUpdate() { this.updatedAt = Instant.now(); }

    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public String getArea() { return area; }
    public void setArea(String area) { this.area = area; }
    public ComplaintStatus getStatus() { return status; }
    public void setStatus(ComplaintStatus status) { this.status = status; }
    public int getUrgency() { return urgency; }
    public void setUrgency(int urgency) { this.urgency = urgency; }
    public Instant getCreatedAt() { return createdAt; }
    public void setCreatedAt(Instant createdAt) { this.createdAt = createdAt; }
    public Instant getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Instant updatedAt) { this.updatedAt = updatedAt; }
}
