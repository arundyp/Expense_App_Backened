package com.arun.ExpenseApplication.repository;

import com.arun.ExpenseApplication.Entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository  extends JpaRepository<Expense,Integer> {
}
