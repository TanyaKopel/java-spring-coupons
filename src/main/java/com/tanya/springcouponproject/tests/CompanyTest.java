package com.tanya.springcouponproject.tests;

import com.tanya.springcouponproject.SpringCouponProjectApplication;
import com.tanya.springcouponproject.dto.CouponDto;
import com.tanya.springcouponproject.enums.CouponCategory;
import com.tanya.springcouponproject.enums.UserType;
import com.tanya.springcouponproject.services.AdminService;
import com.tanya.springcouponproject.services.CompanyService;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import util.LoginUtil;

import java.time.LocalDate;

public class CompanyTest {


    public static void TestCompany() {

        CompanyService companyService = (CompanyService) LoginUtil.userService("email@company2.com",
                "CompPass2", UserType.Company);


        CouponDto couponDto1 = CouponDto.builder()
                .couponCategory(CouponCategory.FOOD)
                .amount(5)
                .description(" 20% Discount on Food")
                .startDate(LocalDate.of(2022, 8, 8))
                .expirationDate(LocalDate.of(2023, 8, 8))
                .price(10L)
                .build();

        CouponDto couponDto2 = CouponDto.builder()
                .couponCategory(CouponCategory.BOOKS)
                .amount(10)
                .description(" 10% Discount on Books ")
                .startDate(LocalDate.of(2022, 8, 8))
                .expirationDate(LocalDate.of(2023, 8, 8))
                .price(5L)
                .build();

        CouponDto couponDto3 = CouponDto.builder()
                .couponCategory(CouponCategory.SPA)
                .amount(3)
                .description(" 2 for the price of 1 ")
                .startDate(LocalDate.of(2022, 8, 8))
                .expirationDate(LocalDate.of(2023, 8, 8))
                .price(50L)
                .build();

        companyService.createCoupon(couponDto1);
        System.out.println("Created Coupon1");
        companyService.createCoupon(couponDto2);
        System.out.println("Created Coupon2");
        companyService.createCoupon(couponDto3);
        System.out.println("Created Coupon3");


        System.out.println("Get All Coupons: ");
        System.out.println(companyService.getAllCoupons());

        System.out.println("Get Company by Id: ");
        companyService.getCouponById(0);

        System.out.println("Delete Company by Id: ");
        companyService.deleteCoupon(0);

    }
}