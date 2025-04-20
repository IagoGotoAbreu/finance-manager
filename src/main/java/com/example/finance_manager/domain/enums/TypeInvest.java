package com.example.finance_manager.domain.enums;

public enum TypeInvest {
    ACAO,
    FIIS,
    CRYPTO;

    public static TypeInvest toEnum(String type) {
        if (type == null) {
            throw new IllegalArgumentException("Tipo não pode ser nulo.");
        }

        try {
            return TypeInvest.valueOf(type.trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Tipo de investimento inválido: " + type);
        }
    }
}