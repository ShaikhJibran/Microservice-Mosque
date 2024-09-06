package com.shaikh.mosque_accounts.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MOSQUE_ACCOUNTS")
public class MosqueAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MOSQUE_ACCOUNT_ID", nullable = false)
    private Long mosqueAccountId;

    @ManyToOne
    @JoinColumn(name = "MOSQUE_ID", referencedColumnName = "Mosque_ID", nullable = false)
    private Mosque mosque;

    @Column(name = "DATE", nullable = false)
    private LocalDate date;

    @Column(name = "AMOUNT", nullable = false)
    private Double amount;

    @Column(name = "RECEIPT_NO", nullable = true)
    private String receiptNo;

    @Column(name = "PAYMENT_MODE", nullable = false)
    private String paymentMode;

    @Column(name = "ACCOUNT_SECTION_TYPE", nullable = false)
    private String accountSectionType;

    @Column(name = "PAYMENT_TYPE", nullable = false)
    private String paymentType;

    @Column(name = "DESCRIPTION", nullable = true)
    private String description;

}
