package com.shaikh.mosque_details.controller;

import com.shaikh.mosque_details.model.Mosque;
import com.shaikh.mosque_details.services.MosqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1")
public class MosqueController {

    @Autowired
    private MosqueService mosqueService;

    @PostMapping(value = "/saveMosqueDetails")
    @ResponseStatus(HttpStatus.CREATED)
    public Mosque saveMosqueDetails(@RequestBody Mosque mosque) {
        return mosqueService.saveMosqueDetails(mosque);
    }

    @PostMapping(value = "/findMosqueById")
    @ResponseStatus(HttpStatus.FOUND)
    public Mosque findMosqueById(@RequestParam Long mosqueId) throws Exception {
        return mosqueService.findMosqueDetails(mosqueId);
    }
}
