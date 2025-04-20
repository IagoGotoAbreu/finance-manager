package com.example.finance_manager.applications.web.dtos.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.LowerCamelCaseStrategy.class)
public class InvestCreateRequestDTO {

    @NotBlank(message = "Name value is mandatory")
    private String name;

    @NotBlank(message = "Type value is mandatory")
    private String type;

    @NotNull(message = "Quantity value is mandatory")
    private Integer quantity;

    @NotNull(message = "Value value is mandatory")
    private Double value;

    @NotNull(message = "Fee value is mandatory")
    private Double fee;
}
