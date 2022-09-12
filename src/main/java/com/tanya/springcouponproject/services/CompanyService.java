package com.tanya.springcouponproject.services;

import com.tanya.springcouponproject.dal.CouponDAL;
import com.tanya.springcouponproject.dal.CustomerDAL;
import com.tanya.springcouponproject.dto.CouponDto;
import com.tanya.springcouponproject.entities.Coupon;
import com.tanya.springcouponproject.entities.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyService extends UserService {

    private final CouponDAL couponDAL;


    public void createCoupon(CouponDto couponDto) {
        couponDAL.saveCoupon(couponDto);
    }

    public void updateCoupon(CouponDto couponDto) {
        couponDAL.saveCoupon(couponDto);
    }

    public void deleteCoupon(long id) {
        couponDAL.deleteCouponById(id);
    }

    public List<Coupon> getAllCoupons() {
        return couponDAL.getAllCoupons();
    }

    public  CouponDto getCouponById(long id){
        return couponDAL.getCouponById(id);
    }
}
