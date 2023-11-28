package com.mycompany.app;

import org.springframework.stereotype.Service;

@Service
public record CostumerService() {
    public void register(CostumerRegistrationRequest request){
    Costumer costumer =Costumer.builder()
            .firstName(request.firstName())
            .lastName(request.lastName())
            .email(request.email())
            .build();
        }
}
