package com.tanya.springcouponproject.repositories;

import com.tanya.springcouponproject.entities.Coupon;
import com.tanya.springcouponproject.enums.CouponCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CouponRepository extends JpaRepository<Coupon, Long> {

    @Query
    List<Coupon> findByCategory(CouponCategory couponCategory);

    @Query
    List<Coupon> findByMaxPrice(Double price);

    @Query
    void ddCouponPurchase(Long customerId, Long couponId);

}
