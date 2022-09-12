package util;

import com.tanya.springcouponproject.dto.CompanyDto;
import com.tanya.springcouponproject.dto.CouponDto;
import com.tanya.springcouponproject.dto.CustomerDto;
import com.tanya.springcouponproject.entities.Company;
import com.tanya.springcouponproject.entities.Coupon;
import com.tanya.springcouponproject.entities.Customer;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DtoBeanMapping {


    public static Customer dtoToCustomer(final CustomerDto customerDto) {
        return Customer.builder()
                .id(customerDto.getId())
                .email(customerDto.getEmail())
                .password(customerDto.getPassword())
                .build();
    }

    public static CustomerDto customerToDto(final Customer customer) {
        return CustomerDto.builder()
                .id(customer.getId())
                .email(customer.getEmail())
                .password(customer.getPassword())
                .build();
    }


    public static Company dtoToCompany(final CompanyDto companyDto) {
        return Company.builder()
                .id(companyDto.getId())
                .email(companyDto.getEmail())
                .password(companyDto.getPassword())
                .build();
    }

    public static CompanyDto companyToDto(final Company company) {
        return CompanyDto.builder()
                .id(company.getId())
                .email(company.getEmail())
                .password(company.getPassword())
                .build();
    }

    public static Coupon dtoToCoupon(final CouponDto couponDto) {
        return Coupon.builder()
                .id(couponDto.getId())
                .couponCategory(couponDto.getCouponCategory())
                .amount(couponDto.getAmount())
                .description(couponDto.getDescription())
                .expirationDate(couponDto.getExpirationDate())
                .startDate(couponDto.getStartDate())
                .price(couponDto.getPrice())
                .build();
    }

    public static CouponDto couponToDto(final Coupon coupon) {
        return CouponDto.builder()
                .id(coupon.getId())
                .couponCategory(coupon.getCouponCategory())
                .amount(coupon.getAmount())
                .description(coupon.getDescription())
                .expirationDate(coupon.getExpirationDate())
                .startDate(coupon.getStartDate())
                .price(coupon.getPrice())
                .build();
    }
}
