package com.tanya.springcouponproject.services;

import com.tanya.springcouponproject.dal.CompanyDAL;
import com.tanya.springcouponproject.dal.CustomerDAL;
import com.tanya.springcouponproject.dto.CompanyDto;
import com.tanya.springcouponproject.dto.CustomerDto;
import com.tanya.springcouponproject.entities.Company;
import com.tanya.springcouponproject.entities.Customer;
import lombok.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminService extends UserService {

    private final CustomerDAL customerDAL;
    private final CompanyDAL companyDAL;

    public void createCompany(CompanyDto companyDto) {
        companyDAL.saveCompany(companyDto);
    }

    public CompanyDto getCompanyById(long id) {
        return companyDAL.getCompanyById(id);
    }

    public void updateCompany(CompanyDto companyDto) {
        companyDAL.saveCompany(companyDto);
    }

    public void deleteCompany(long id) {
        companyDAL.deleteCompanyById(id);
    }

    public boolean isCompanyExists(String email, String password) {
        return companyDAL.isCompanyExists(email, password);
    }

    public List<Company> getAllCompanies() {
        return companyDAL.getAllCompanies();
    }


    public void createCustomer(CustomerDto customerDto) {
        customerDAL.saveCustomer(customerDto);
    }

    public CustomerDto getCustomerByID(long id) {
        return customerDAL.getCustomerByID(id);
    }

    public void updateCustomer(CustomerDto customerDto) {
        customerDAL.saveCustomer(customerDto);
    }

    public void deleteCustomer(long id) {
        customerDAL.deleteCustomerByID(id);
    }

    public boolean isCustomerExists(String email, String password) {
        return customerDAL.isCustomerExists(email, password);
    }

    public List<Customer> getAllCustomers() {
        return customerDAL.getAllCustomers();
    }
}
