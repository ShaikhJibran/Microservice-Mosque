package com.shaikh.mosque_accounts.controller;

import com.shaikh.mosque_accounts.model.MosqueAccount;
import com.shaikh.mosque_accounts.services.MosqueAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class MosqueAccountController {

    @Autowired
    private MosqueAccountService mosqueAccountService;


    @PostMapping("/saveMosqueAccount")
    public MosqueAccount saveMosqueAccount(MosqueAccount mosqueAccount) {
        return mosqueAccountService.saveMosqueAccount(mosqueAccount);
    }

    @GetMapping("/fetcMosqueAccount/{mosqueId}")
    public List<MosqueAccount> fetchMosqueAccount(@PathVariable Long mosqueId) {

        return mosqueAccountService.fetchMosqueAccounts(mosqueId);
    }
}
