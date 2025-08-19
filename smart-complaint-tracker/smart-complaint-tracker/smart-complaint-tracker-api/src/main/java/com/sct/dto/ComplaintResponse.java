package com.sct.dto;

import com.sct.model.ComplaintStatus;
import java.time.Instant;

public class ComplaintResponse {
    private Long id;
    private String title;
    private String description;
    private String category;
    private String area;
    private ComplaintStatus status;
    private int urgency;
    private Instant createdAt;
    private Instant updatedAt;

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
