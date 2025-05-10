package com.arun.ExpenseApplication.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ExpenseDTO {
    private int id;
    private String name;
    private String description;
    private int amount;
    private String date;
}
