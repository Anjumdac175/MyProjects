package com.sct.controller;

import com.sct.dto.ComplaintRequest;
import com.sct.dto.ComplaintResponse;
import com.sct.dto.UpdateStatusRequest;
import com.sct.model.ComplaintStatus;
import com.sct.service.ComplaintService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/complaints")
public class ComplaintController {

    @Autowired
    private ComplaintService service;

    @PostMapping
    public ComplaintResponse create(@Valid @RequestBody ComplaintRequest req) {
        return service.create(req);
    }

    @GetMapping("/{id}")
    public ComplaintResponse get(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public ComplaintResponse update(@PathVariable Long id, @Valid @RequestBody ComplaintRequest req) {
        return service.update(id, req);
    }

    @PatchMapping("/{id}/status")
    public ComplaintResponse updateStatus(@PathVariable Long id, @Valid @RequestBody UpdateStatusRequest req) {
        return service.updateStatus(id, req.getStatus());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping
    public Page<ComplaintResponse> list(
            @RequestParam(required = false) String area,
            @RequestParam(required = false) ComplaintStatus status,
            @RequestParam(required = false, name="q") String query,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "updatedAt,DESC") String sort) {

        String[] p = sort.split(",", 2);
        Sort.Direction dir = (p.length > 1 && p[1].equalsIgnoreCase("ASC")) ? Sort.Direction.ASC : Sort.Direction.DESC;
        Pageable pageable = PageRequest.of(page, size, Sort.by(dir, p[0]));
        return service.list(area, status, query, pageable);
    }

    @GetMapping("/urgent")
    public List<ComplaintResponse> topUrgent(@RequestParam(defaultValue = "5") int limit) {
        return service.topUrgent(limit);
    }

    @GetMapping("/category-freq")
    public Map<String, Long> categoryFrequency() {
        return service.categoryFrequency();
    }
}
