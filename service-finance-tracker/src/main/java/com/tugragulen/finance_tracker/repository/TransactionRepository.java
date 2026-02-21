package com.tugragulen.finance_tracker.repository;

import com.tugragulen.finance_tracker.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * Created by tugragulen on 21.02.2026 at 14:16
 */
@Repository
public interface TransactionRepository extends JpaRepository<Transaction, UUID> {
}
