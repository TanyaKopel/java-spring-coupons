package com.tanya.springcouponproject.tests;

import com.tanya.springcouponproject.enums.CouponCategory;
import com.tanya.springcouponproject.enums.UserType;
import com.tanya.springcouponproject.services.CustomerService;
import util.LoginUtil;

public class CustomerTest {


    public static void TestCustomer() {

        CustomerService customerService = (CustomerService) LoginUtil.userService("email@customer2.com",
                "CustPass2", UserType.Customer);

        System.out.println("Get all coupons: ");
        System.out.println();
        customerService.getAllCoupons();
        System.out.println("get coupon by Category: ");
        System.out.println(customerService.getCouponsByCategory(CouponCategory.BOOKS));
        System.out.println("get coupon by Max Price: ");
        System.out.println(customerService.getByMaxPrice(7.00));

    }
}