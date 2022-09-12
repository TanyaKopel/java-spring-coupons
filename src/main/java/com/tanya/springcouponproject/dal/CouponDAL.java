package com.tanya.springcouponproject.dal;

import com.tanya.springcouponproject.dto.CouponDto;
import com.tanya.springcouponproject.entities.Coupon;
import com.tanya.springcouponproject.enums.CouponCategory;
import com.tanya.springcouponproject.repositories.CouponRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import util.DtoBeanMapping;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class CouponDAL {

    private final CouponRepository couponRepository;

    public void saveCoupon(CouponDto couponDto) {
        couponRepository.save(DtoBeanMapping.dtoToCoupon(couponDto));
    }

    public CouponDto getCouponById(long id) {
        final Optional<Coupon> couponOptional = couponRepository.findById(id);

        if (couponOptional.isEmpty()) {
            return null;
        }
        return DtoBeanMapping.couponToDto(couponOptional.get());
    }

    public void deleteCouponById(long id) {
        couponRepository.deleteById(id);
    }

    public List<Coupon> getAllCoupons() {
        return couponRepository.findAll();
    }

    public List<Coupon> getCouponsByCategory(CouponCategory couponCategory) {
        return couponRepository.findByCategory(couponCategory);
    }

    public List<Coupon> getCouponsByMaxPrice(double maxPrice) {
        return couponRepository.findByMaxPrice(maxPrice);
    }
}


