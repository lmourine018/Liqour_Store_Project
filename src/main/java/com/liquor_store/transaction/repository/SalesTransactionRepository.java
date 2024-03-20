package com.liquor_store.transaction.repository;

import com.liquor_store.transaction.entity.SalesTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesTransactionRepository extends JpaRepository<SalesTransaction, Integer> {
}
