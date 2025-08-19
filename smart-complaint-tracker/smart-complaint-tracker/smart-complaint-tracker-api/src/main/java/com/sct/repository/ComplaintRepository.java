package com.sct.repository;

import com.sct.model.Complaint;
import com.sct.model.ComplaintStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplaintRepository extends JpaRepository<Complaint, Long> {
    Page<Complaint> findByAreaIgnoreCase(String area, Pageable pageable);
    Page<Complaint> findByStatus(ComplaintStatus status, Pageable pageable);
    Page<Complaint> findByTitleContainingIgnoreCaseOrDescriptionContainingIgnoreCase(
            String title, String description, Pageable pageable);
}
