package com.shaikh.masjid_details.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.shaikh.masjid_details.utils.Constants;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import java.time.ZonedDateTime;

@Getter
@Setter
@FieldNameConstants
@MappedSuperclass
public class AuditLogModel {

    @CreatedBy
    @Column(name = "CREATED_BY", updatable = false, nullable = false)
    private Long createdBy;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = Constants.DATE_FORMAT)
    @CreationTimestamp
    @Column(name = "CREATED_DATE", updatable = false, nullable = false)
    private ZonedDateTime createdDate;

    @LastModifiedBy
    @Column(name = "MODIFIED_BY", nullable = false)
    private Long modifiedBy;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = Constants.DATE_FORMAT)
    @UpdateTimestamp
    @Column(name = "MODIFIED_DATE", nullable = false)
    private ZonedDateTime modifiedDate;
}

