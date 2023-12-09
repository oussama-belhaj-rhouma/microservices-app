package com.mycompany.app;

import com.mycompany.app.clients.fraud.FraudCheckResponse;
import com.mycompany.app.clients.fraud.FraudClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor

public class CostumerService {
    private final CostumerRepo costumerRepo;
    private RestTemplate restTemplate;
    private final FraudClient fraudClient;
    public void register(CostumerRegistrationRequest request){
    Costumer costumer =Costumer.builder()
            .firstName(request.firstName())
            .lastName(request.lastName())
            .email(request.email())
            .build();
    costumerRepo.saveAndFlush(costumer);

        FraudCheckResponse fraudCheckResponse= fraudClient.isFraudster(costumer.getId());
        if(fraudCheckResponse.isFraudster()){
        throw new IllegalStateException("fraudster !!!!!!!");
    }

        }

}
