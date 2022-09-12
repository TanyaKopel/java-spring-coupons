package com.tanya.springcouponproject.repositories;

import com.tanya.springcouponproject.entities.Company;
import com.tanya.springcouponproject.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Boolean existsByEmailAndPassword (String email, String password);


}
