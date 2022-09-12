package com.tanya.springcouponproject.tests;

import com.tanya.springcouponproject.SpringCouponProjectApplication;
import com.tanya.springcouponproject.dto.CompanyDto;
import com.tanya.springcouponproject.dto.CustomerDto;
import com.tanya.springcouponproject.enums.UserType;
import com.tanya.springcouponproject.services.AdminService;
import org.springframework.boot.SpringApplication;
import util.LoginUtil;

public class AdminTest {


    public static void TestAdmin() {

        AdminService adminService = (AdminService) LoginUtil.userService("admin@admin.com",
                "Coding@2022", UserType.Administrator);

        CompanyDto companyDto1 = CompanyDto.builder().name("Company1")
                .email("email@company1.com").password("CompPass1").build();
        CompanyDto companyDto2 = CompanyDto.builder().name("Company2")
                .email("email@company2.com").password("CompPass2").build();

        CustomerDto customerDto1 = CustomerDto.builder().firstName("First1").lastName("Last1")
                .email("email@customer1.com").password("CustPass1").build();
        CustomerDto customerDto2 = CustomerDto.builder().firstName("First2").lastName("Last2")
                .email("email@customer2.com").password("CustPass2").build();

        adminService.createCompany(companyDto1);
        System.out.println("Created Company1");
        adminService.createCompany(companyDto2);
        System.out.println("Created Company2");

        System.out.println("Get All Companies: ");
        System.out.println(adminService.getAllCompanies());

        System.out.println("Get Company by Id: ");
        System.out.println(adminService.getCompanyById(0));

        System.out.println("Delete Company by Id: ");
        adminService.deleteCompany(0);

        adminService.createCustomer(customerDto1);
        System.out.println("Created Customer1");
        adminService.createCustomer(customerDto2);
        System.out.println("Created Customer2");


        System.out.println("Get All Customers: ");
        System.out.println(adminService.getAllCustomers());

        System.out.println("Get Customer by Id: ");
        System.out.println(adminService.getCustomerByID(0));

        System.out.println("Delete Customer by Id: ");
        adminService.deleteCompany(0);

    }
}
