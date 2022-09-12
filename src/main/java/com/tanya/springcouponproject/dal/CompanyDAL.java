package com.tanya.springcouponproject.dal;

import com.tanya.springcouponproject.dto.CompanyDto;
import com.tanya.springcouponproject.entities.Company;
import com.tanya.springcouponproject.repositories.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import util.DtoBeanMapping;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class CompanyDAL {

    private final CompanyRepository companyRepository;

    public void saveCompany(CompanyDto companyDto) {
        companyRepository.save(DtoBeanMapping.dtoToCompany(companyDto));

    }

    public CompanyDto getCompanyById(long id) {
        final Optional<Company> companyOptional = companyRepository.findById(id);

        if (companyOptional.isEmpty()) {
            return null;
        }
        return DtoBeanMapping.companyToDto(companyOptional.get());
    }

    public void deleteCompanyById(long id) {
        companyRepository.deleteById(id);
    }

    public boolean isCompanyExists(String email, String password) {
        return companyRepository.existsByEmailAndPassword(email, password);
    }

    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }
}
