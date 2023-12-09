package com.mycompany.app;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/costumer")
@AllArgsConstructor
public class CostumerController {
    private final CostumerService costumerService;
    @PostMapping
    public void registerCostumer(@RequestBody CostumerRegistrationRequest costumerRequest) {
        log.info("costumer registered successfully", costumerRequest);
        costumerService.register(costumerRequest);
    }
}
