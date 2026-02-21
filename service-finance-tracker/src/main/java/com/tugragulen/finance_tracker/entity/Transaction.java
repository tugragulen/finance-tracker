package com.tugragulen.finance_tracker.entity;

import com.tugragulen.finance_tracker.enumeration.TransactionType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Created by tugragulen on 21.02.2026 at 13:47
 */
@Entity
@Table(name = "t_transactions")
@Getter
@Setter
public class Transaction extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;

    @Column(nullable = false, precision = 19, scale = 4)
    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private TransactionType type; // snapshot

    private String description;

    private LocalDate transactionDate;

    private boolean deleted = false;

    @Version
    private Long version;
}
