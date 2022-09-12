package com.tanya.springcouponproject;

import com.tanya.springcouponproject.tests.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCouponProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCouponProjectApplication.class, args);
        ApplicationContext cxt = SpringApplication.run(SpringCouponProjectApplication.class, args);

        AdminTest.TestAdmin();
        CompanyTest.TestCompany();
        CustomerTest.TestCustomer();

    }
}
