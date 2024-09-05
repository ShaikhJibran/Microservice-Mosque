package com.shaikh.masjid_details.services;

import com.shaikh.masjid_details.model.Mosque;
import com.shaikh.masjid_details.repository.MosqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.rmi.NoSuchObjectException;
import java.util.Optional;

@Service
public class MosqueService {

    @Autowired
    private MosqueRepository mosqueRepository;

    public Mosque saveMosqueDetails(Mosque mosque) {
        return mosqueRepository.save(mosque);
    }

    public Mosque findMosqueDetails(Long mosqueId) throws Exception {
        Optional<Mosque> mosque = mosqueRepository.findById(mosqueId);
        if (mosque.isPresent()) {
            return mosque.get();
        } else {
            throw new NoSuchObjectException("No Mosque Found");
        }
    }
}
