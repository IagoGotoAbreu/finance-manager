package com.example.finance_manager.domain.services;

import com.example.finance_manager.domain.entities.Invest;
import com.example.finance_manager.domain.enums.TypeInvest;
import com.example.finance_manager.domain.repositories.InvestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class InvestService {
    private final InvestRepository investRepository;

    public Invest create(String name, String type, Integer quantity, Double value, Double fee) {
        Invest invest = new Invest();
        invest.setName(name);
        invest.setType(TypeInvest.toEnum(type));
        invest.setQuantity(quantity);
        invest.setValue(value);
        invest.setFee(fee);
        return investRepository.save(invest);
    }
}
