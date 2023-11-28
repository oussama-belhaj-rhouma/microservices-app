package com.mycompany.app;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping("/api/costumer")
public record CostumerController(CostumerService costumerService) {
    @PostMapping
    public void registerCostumer(@RequestBody CostumerRegistrationRequest costumerRequest){
        log.info("costumer registered successfully", costumerRequest);
        costumerService.register(costumerRequest);
    }
}
