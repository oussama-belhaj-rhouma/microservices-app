package com.mycompany.app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CostumerRepo extends JpaRepository<Costumer, Long> {

}
