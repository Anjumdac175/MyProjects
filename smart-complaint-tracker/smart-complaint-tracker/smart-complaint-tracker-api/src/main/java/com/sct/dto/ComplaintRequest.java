package com.sct.dto;

import com.sct.model.ComplaintStatus;
import jakarta.validation.constraints.*;

public class ComplaintRequest {
    @NotBlank @Size(max=150)
    private String title;

    @NotBlank @Size(max=1000)
    private String description;

    @NotBlank @Size(max=60)
    private String category;

    @NotBlank @Size(max=60)
    private String area;

    @Min(1) @Max(5)
    private int urgency = 1;

    private ComplaintStatus status = ComplaintStatus.PENDING;

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public String getArea() { return area; }
    public void setArea(String area) { this.area = area; }
    public int getUrgency() { return urgency; }
    public void setUrgency(int urgency) { this.urgency = urgency; }
    public ComplaintStatus getStatus() { return status; }
    public void setStatus(ComplaintStatus status) { this.status = status; }
}
