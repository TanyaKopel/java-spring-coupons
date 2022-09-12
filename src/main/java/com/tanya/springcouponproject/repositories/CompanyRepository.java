package com.tanya.springcouponproject.repositories;

import com.tanya.springcouponproject.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

    Boolean existsByEmailAndPassword (String email, String password);


}
