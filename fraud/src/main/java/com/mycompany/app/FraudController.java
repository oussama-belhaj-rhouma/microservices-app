package com.mycompany.app;
import com.mycompany.app.clients.fraud.FraudCheckResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/api/fraud")
public class FraudController {
    private final FraudCheckService fraudCheckService;
    public FraudController(FraudCheckService fraudCheckService){
        this.fraudCheckService=fraudCheckService;
    }
    @GetMapping(path = "{costumerId}")
    public FraudCheckResponse isFraudster(@PathVariable("costumerId") Long costumerId){
        boolean fraudulentCostumer= fraudCheckService.isFraudulentCostumer(costumerId);
        log.info("fraud or not registered");
        return new FraudCheckResponse(fraudulentCostumer);
    }
}
