package com.tugragulen.finance_tracker.repository;

import com.tugragulen.finance_tracker.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * Created by tugragulen on 21.02.2026 at 14:17
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
