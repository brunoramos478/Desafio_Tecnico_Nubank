package com.desafio.nubank.adapter.out.web;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Response {

    private int status;
    private String message;


}
