package com.shaikh.mosque_accounts.services;

import com.shaikh.mosque_accounts.model.MosqueAccount;
import com.shaikh.mosque_accounts.repository.MosqueAccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MosqueAccountService {

    private final MosqueAccountRepository mosqueAccountRepository;

    public MosqueAccount saveMosqueAccount(MosqueAccount mosqueAccount) {

        return mosqueAccountRepository.save(mosqueAccount);
    }

    public List<MosqueAccount> fetchMosqueAccounts(Long mosqueId) {
        return mosqueAccountRepository.findMosqueAccountByMosqueId(mosqueId);
    }
}
