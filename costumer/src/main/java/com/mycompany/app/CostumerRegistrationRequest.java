package com.mycompany.app;

public record CostumerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {

}
