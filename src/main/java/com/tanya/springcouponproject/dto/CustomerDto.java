package com.tanya.springcouponproject.dto;

import lombok.*;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

}

