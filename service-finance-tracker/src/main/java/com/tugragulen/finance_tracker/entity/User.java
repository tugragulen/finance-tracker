package com.tugragulen.finance_tracker.entity;

import com.tugragulen.finance_tracker.enumeration.UserStatus;
import jakarta.persistence.*;

/**
 * Created by tugragulen on 21.02.2026 at 13:40
 */
@Entity
@Table(name = "t_users")
public class User extends BaseEntity {

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    private UserStatus status;
}
