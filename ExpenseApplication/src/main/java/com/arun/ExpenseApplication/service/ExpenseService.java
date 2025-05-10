package com.arun.ExpenseApplication.service;

import com.arun.ExpenseApplication.Entity.Expense;

import java.util.List;

public interface ExpenseService {

    Expense saveExpense(Expense expense);
    Expense getExpenseById(int id);
    Expense updateExpense(Expense expense);
    void deleteExpense(int id);
    List<Expense> getAllExpenses();
}
