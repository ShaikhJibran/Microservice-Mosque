package com.shaikh.mosque_accounts.repository;

import com.shaikh.mosque_accounts.model.MosqueAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MosqueAccountRepository extends JpaRepository<MosqueAccount, Long> {

    List<MosqueAccount> findMosqueAccountByMosqueId(Long mosqueId);
}
