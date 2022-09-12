package com.tanya.springcouponproject.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.tanya.springcouponproject.enums.CouponCategory;
import lombok.*;

import java.time.LocalDate;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CouponDto {

    private Long id;
    private CouponCategory couponCategory;
    private String description;
    private String title;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate startDate;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate expirationDate;
    private int amount;
    private double price;


}
