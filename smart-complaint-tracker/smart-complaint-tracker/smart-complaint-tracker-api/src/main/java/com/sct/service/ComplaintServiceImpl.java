package com.sct.service;

import com.sct.dto.ComplaintRequest;
import com.sct.dto.ComplaintResponse;
import com.sct.exception.NotFoundException;
import com.sct.mapper.ComplaintMapper;
import com.sct.model.Complaint;
import com.sct.model.ComplaintStatus;
import com.sct.repository.ComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ComplaintServiceImpl implements ComplaintService {

    @Autowired
    private ComplaintRepository repo;

    @Override
    public ComplaintResponse create(ComplaintRequest req) {
        Complaint c = repo.save(ComplaintMapper.toEntity(req));
        return ComplaintMapper.toDto(c);
    }

    @Override
    public ComplaintResponse getById(Long id) {
        Complaint c = repo.findById(id).orElseThrow(() -> new NotFoundException("Complaint not found: " + id));
        return ComplaintMapper.toDto(c);
    }

    @Override
    public ComplaintResponse update(Long id, ComplaintRequest req) {
        Complaint c = repo.findById(id).orElseThrow(() -> new NotFoundException("Complaint not found: " + id));
        c.setTitle(req.getTitle());
        c.setDescription(req.getDescription());
        c.setCategory(req.getCategory());
        c.setArea(req.getArea());
        c.setUrgency(req.getUrgency());
        c.setStatus(req.getStatus());
        return ComplaintMapper.toDto(repo.save(c));
    }

    @Override
    public void delete(Long id) {
        if (!repo.existsById(id)) throw new NotFoundException("Complaint not found: " + id);
        repo.deleteById(id);
    }

    @Override
    public Page<ComplaintResponse> list(String area, ComplaintStatus status, String q, Pageable pageable) {
        Page<Complaint> page;
        if (area != null && !area.isBlank()) {
            page = repo.findByAreaIgnoreCase(area, pageable);
        } else if (status != null) {
            page = repo.findByStatus(status, pageable);
        } else if (q != null && !q.isBlank()) {
            page = repo.findByTitleContainingIgnoreCaseOrDescriptionContainingIgnoreCase(q, q, pageable);
        } else {
            page = repo.findAll(pageable);
        }
        return page.map(ComplaintMapper::toDto);
    }

    @Override
    public List<ComplaintResponse> topUrgent(int limit) {
        return repo.findAll().stream()
                .sorted(Comparator.comparingInt(Complaint::getUrgency).reversed())
                .limit(Math.max(1, limit))
                .map(ComplaintMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public Map<String, Long> categoryFrequency() {
        return repo.findAll().stream()
                .collect(Collectors.groupingBy(Complaint::getCategory, Collectors.counting()));
    }

    @Override
    public ComplaintResponse updateStatus(Long id, ComplaintStatus status) {
        Complaint c = repo.findById(id).orElseThrow(() -> new NotFoundException("Complaint not found: " + id));
        c.setStatus(status);
        return ComplaintMapper.toDto(repo.save(c));
    }
}
