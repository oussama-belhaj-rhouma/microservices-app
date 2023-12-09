package com.mycompany.app;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class FraudCheckService {
    private final FraudCheckHistoryRepo fraudCheckHistoryRepo;

    public FraudCheckService(FraudCheckHistoryRepo fraudCheckHistoryRepo){
        this.fraudCheckHistoryRepo = fraudCheckHistoryRepo;
    }
    public Boolean isFraudulentCostumer(Long id){
        FraudCheckHistory fraud1 = FraudCheckHistory.builder()
                .costumerId(id)
                .dateTime(LocalDateTime.now())
                .isFraudster(false)
                .build();

        fraudCheckHistoryRepo.save(fraud1);

        return false;
    }
}

