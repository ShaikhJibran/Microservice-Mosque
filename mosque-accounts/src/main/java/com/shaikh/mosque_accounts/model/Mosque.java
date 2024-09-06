package com.shaikh.mosque_accounts.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MOSQUE")
public class Mosque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MOSQUE_ID", nullable = false)
    private Long mosqueId;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Embedded
    private Address address;

    @Column(name = "CONTACT_NUMBER", nullable = false)
    private String contactNumber;

    @Column(name = "CAPACITY", nullable = false)
    private Long capacity;

    @Column(name = "EMAIL_ID", nullable = true)
    private String emailId;

    @Column(name = "WEBSITE", nullable = true)
    private String website;

    @Column(name = "IS_MAKTAB_AVAILABLE", nullable = true)
    private boolean isMaktabAvailable;

    @Column(name = "IS_SPACAE_FOR_WOMEN", nullable = true)
    private boolean isSpacaeForWomen;

    @Column(name = "DESCRIPTION", nullable = true)
    private String description;

    @Column(name = "NOTICE", nullable = true)
    private String notice;

    @Column(name = "ACCOUNT_NAME", nullable = true)
    private String accountName;

    @Column(name = "ACCOUNT_NUMBER", nullable = true)
    private String accountNumber;

    @Column(name = "IFSC_CODE", nullable = true)
    private String ifscCode;

    @Column(name = "BRANCH_NAME", nullable = true)
    private String branchName;

}
