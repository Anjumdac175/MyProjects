package com.sct.service;

import com.sct.dto.ComplaintRequest;
import com.sct.dto.ComplaintResponse;
import com.sct.model.ComplaintStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public interface ComplaintService {
    ComplaintResponse create(ComplaintRequest req);
    ComplaintResponse getById(Long id);
    ComplaintResponse update(Long id, ComplaintRequest req);
    void delete(Long id);

    Page<ComplaintResponse> list(String area, ComplaintStatus status, String q, Pageable pageable);

    List<ComplaintResponse> topUrgent(int limit);
    Map<String, Long> categoryFrequency();
    ComplaintResponse updateStatus(Long id, ComplaintStatus status);
}
