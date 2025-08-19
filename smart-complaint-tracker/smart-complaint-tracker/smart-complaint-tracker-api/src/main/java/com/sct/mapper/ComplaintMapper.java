package com.sct.mapper;

import com.sct.dto.ComplaintRequest;
import com.sct.dto.ComplaintResponse;
import com.sct.model.Complaint;

public class ComplaintMapper {
    public static Complaint toEntity(ComplaintRequest dto) {
        Complaint c = new Complaint();
        c.setTitle(dto.getTitle());
        c.setDescription(dto.getDescription());
        c.setCategory(dto.getCategory());
        c.setArea(dto.getArea());
        c.setUrgency(dto.getUrgency());
        c.setStatus(dto.getStatus());
        return c;
    }

    public static ComplaintResponse toDto(Complaint c) {
        ComplaintResponse r = new ComplaintResponse();
        r.setId(c.getId());
        r.setTitle(c.getTitle());
        r.setDescription(c.getDescription());
        r.setCategory(c.getCategory());
        r.setArea(c.getArea());
        r.setStatus(c.getStatus());
        r.setUrgency(c.getUrgency());
        r.setCreatedAt(c.getCreatedAt());
        r.setUpdatedAt(c.getUpdatedAt());
        return r;
    }
}
