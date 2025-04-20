package com.example.finance_manager.domain.repositories;

import com.example.finance_manager.domain.entities.Invest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestRepository extends JpaRepository<Invest, Long> {
}
