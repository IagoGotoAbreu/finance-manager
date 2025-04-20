package com.example.finance_manager.applications.web.controllers;

import com.example.finance_manager.applications.web.dtos.request.InvestCreateRequestDTO;
import com.example.finance_manager.domain.entities.Invest;
import com.example.finance_manager.domain.services.InvestService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/invest")
public class InvestController {

    private final InvestService investService;

    @PostMapping("/save")
    public ResponseEntity<Invest> create(
            @Valid @RequestBody
            InvestCreateRequestDTO createDto
    ){
        return ResponseEntity.ok(
                investService.create(
                        createDto.getName(),
                        createDto.getType(),
                        createDto.getQuantity(),
                        createDto.getValue(),
                        createDto.getFee()
                )
        );
    }
}
