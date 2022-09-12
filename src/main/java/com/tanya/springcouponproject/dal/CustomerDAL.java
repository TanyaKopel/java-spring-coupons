package com.tanya.springcouponproject.dal;

import com.tanya.springcouponproject.dto.CustomerDto;
import com.tanya.springcouponproject.entities.Customer;
import com.tanya.springcouponproject.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import util.DtoBeanMapping;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class CustomerDAL {

    public final CustomerRepository customerRepository;

    public void saveCustomer(CustomerDto customerDto) {
        customerRepository.save(DtoBeanMapping.dtoToCustomer(customerDto));
    }

    public CustomerDto getCustomerByID(long id) {
        final Optional<Customer> customerOptional = customerRepository.findById(id);

        if (customerOptional.isEmpty()) {
            return null;
        }
        return DtoBeanMapping.customerToDto(customerOptional.get());
    }

    public void deleteCustomerByID(long id) {
        customerRepository.deleteById(id);
    }

    public boolean isCustomerExists(String email, String password) {
        return customerRepository.existsByEmailAndPassword(email, password);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}
