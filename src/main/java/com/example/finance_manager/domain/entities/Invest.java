package com.example.finance_manager.domain.entities;

import com.example.finance_manager.domain.enums.TypeInvest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "investimento")
public class Invest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String name;

    @Column(name = "tipo", nullable = false)
    @Enumerated(EnumType.STRING)
    private TypeInvest type;

    @Column(name = "quantidade", nullable = false)
    private Integer quantity;

    @Column(name = "valor", nullable = false)
    private Double value;

    @Column(name = "taxa", nullable = false)
    private Double fee;
}
