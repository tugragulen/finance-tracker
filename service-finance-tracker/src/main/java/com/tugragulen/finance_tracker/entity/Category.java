package com.tugragulen.finance_tracker.entity;

import com.tugragulen.finance_tracker.enumeration.CategoryType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by tugragulen on 21.02.2026 at 13:44
 */
@Entity
@Table(name = "t_categories",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"user_id", "name"})
        })
@Getter
@Setter
public class Category extends BaseEntity {

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    private CategoryType type;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

}
