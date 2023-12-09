package com.mycompany.app.clients.fraud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("fraud")
public interface FraudClient {
    @GetMapping(path = "api/fraud/{costumerId}")
     FraudCheckResponse isFraudster(@PathVariable("costumerId") Long costumerId);
}
