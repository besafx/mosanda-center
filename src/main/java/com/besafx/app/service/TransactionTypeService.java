package com.besafx.app.service;

import com.besafx.app.entity.TransactionType;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public interface TransactionTypeService extends PagingAndSortingRepository<TransactionType, Long>, JpaSpecificationExecutor<TransactionType> {
    TransactionType findByCode(String code);
}
