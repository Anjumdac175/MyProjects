package com.sct.dto;

import com.sct.model.ComplaintStatus;
import jakarta.validation.constraints.NotNull;

public class UpdateStatusRequest {
    @NotNull
    private ComplaintStatus status;

    public ComplaintStatus getStatus() { return status; }
    public void setStatus(ComplaintStatus status) { this.status = status; }
}
