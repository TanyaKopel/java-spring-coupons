package com.tanya.springcouponproject.dto;

import lombok.*;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDto {

    private Long id;
    private String name;
    private String email;
    private String password;

}

