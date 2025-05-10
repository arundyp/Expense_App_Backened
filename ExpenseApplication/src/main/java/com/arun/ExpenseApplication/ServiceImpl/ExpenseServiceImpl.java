package com.arun.ExpenseApplication.ServiceImpl;

import com.arun.ExpenseApplication.Entity.Expense;
import com.arun.ExpenseApplication.exception.ResourceNotFoundException;
import com.arun.ExpenseApplication.repository.ExpenseRepository;
import com.arun.ExpenseApplication.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExpenseServiceImpl implements ExpenseService {

    private final ExpenseRepository expenseRepository;

    @Override
    public Expense saveExpense(Expense expense) {
        Expense save = this.expenseRepository.save(expense);
        return save;
    }

    @Override
    public Expense getExpenseById(int id) {
        Expense expenseNotFound = this.expenseRepository.findById(id).
                orElseThrow(() -> new ResourceNotFoundException("Expense not found"));
        return expenseNotFound;
    }

    @Override
    public Expense updateExpense(Expense expense) {
        return null;
    }

    @Override
    public void deleteExpense(int id) {
        Expense expenseFound = this.expenseRepository.findById(id).
                orElseThrow(() -> new ResourceNotFoundException("Expense not found"));

        this.expenseRepository.delete(expenseFound);

    }

    @Override
    public List<Expense> getAllExpenses() {
        List<Expense> all = this.expenseRepository.findAll();
        return all;
    }
}
