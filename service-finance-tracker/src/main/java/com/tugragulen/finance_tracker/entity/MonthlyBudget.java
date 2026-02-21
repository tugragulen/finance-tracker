package com.tugragulen.finance_tracker.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created by tugragulen on 21.02.2026 at 13:49
 */
@Entity
@Table(name = "t_monthly_budgets",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {
                        "user_id", "category_id", "year", "month"
                })
        })
@Getter
@Setter
public class MonthlyBudget extends BaseEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private Category category; // nullable

    private Integer year;
    private Integer month;

    @Column(nullable = false, precision = 19, scale = 4)
    private BigDecimal limitAmount;
}
