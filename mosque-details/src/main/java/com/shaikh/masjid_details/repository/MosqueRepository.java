package com.shaikh.masjid_details.repository;

import com.shaikh.masjid_details.model.Mosque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MosqueRepository extends JpaRepository<Mosque, Long> {
}
