package com.tanya.springcouponproject.entities;

import lombok.*;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "companies")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    private List<Coupon> companyCoupons;

}


