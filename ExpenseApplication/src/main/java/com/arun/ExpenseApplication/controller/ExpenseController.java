package com.arun.ExpenseApplication.controller;

import com.arun.ExpenseApplication.Entity.Expense;
import com.arun.ExpenseApplication.service.ExpenseService;
import com.arun.ExpenseApplication.util.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ExpenseController {

    private final ExpenseService expenseService;
    @PostMapping("/exp")
    public ResponseEntity<Expense> saveExpense(@RequestBody Expense expense){
        return ResponseEntity.ok(expenseService.saveExpense(expense));
    }
    @GetMapping("/expense/{id}")
    public ResponseEntity<Expense> getExpenseById(@PathVariable int id){
        return ResponseEntity.ok(expenseService.getExpenseById(id));
    }

    @GetMapping("/expense")
    public ResponseEntity<List<Expense>> getAllExpenses(){
        return ResponseEntity.ok(expenseService.getAllExpenses());
    }
    @DeleteMapping("/deleteExpense/{id}")
    public ResponseEntity<ApiResponse> deleteExpense(@PathVariable int id){
        expenseService.deleteExpense(id);
        return  new ResponseEntity<ApiResponse>(new ApiResponse("Expense deleted successfully","200"), HttpStatus.OK);
    }

}
