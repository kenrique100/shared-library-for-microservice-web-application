package com.akentech.microservices.common.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryRequest {
    @NotBlank(message = "SKU Code is required")
    private String skuCode;

    @NotNull(message = "Quantity is required")
    private Integer quantity;
}