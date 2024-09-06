package com.shaikh.mosque_details.repository;

import com.shaikh.mosque_details.model.Mosque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MosqueRepository extends JpaRepository<Mosque, Long> {
}
