package com.tanya.springcouponproject.services;

import com.tanya.springcouponproject.dal.CouponDAL;
import com.tanya.springcouponproject.dto.CouponDto;
import com.tanya.springcouponproject.entities.Coupon;
import com.tanya.springcouponproject.enums.CouponCategory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import util.DtoBeanMapping;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService extends UserService{

    private final CouponDAL couponDAL;

    public List<Coupon> getAllCoupons() {
        return couponDAL.getAllCoupons();
    }

    public CouponDto getCouponById(long id) {
        return couponDAL.getCouponById(id);
    }

    public List<Coupon> getCouponsByCategory(CouponCategory couponCategory) {
        return couponDAL.getCouponsByCategory(couponCategory);
    }

    public List<Coupon> getByMaxPrice(Double maxPrice) {
        return couponDAL.getCouponsByMaxPrice(maxPrice);
    }
}
