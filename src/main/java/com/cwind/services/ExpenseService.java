package com.cwind.services;

import java.util.List;

import com.cwind.entity.Expense;
import com.cwind.store.ExpenseStore;

public class ExpenseService {
	private ExpenseStore expenseStore;

	public ExpenseStore getExpenseStore() {
		return expenseStore;
	}

	public void setExpenseStore(ExpenseStore expenseStore) {
		this.expenseStore = expenseStore;
	}

	public Expense get(Integer id){
		return expenseStore.get(id);
	}
	
	public Integer save(Expense expense){
		return expenseStore.save(expense);
	}
	
	public void update(Expense expense){
		expenseStore.update(expense);
	}
	
	public void delete(Expense expense){
		expenseStore.delete(expense);
	}
	
	public void delete(Integer id){
		expenseStore.delete(id);
	}
	
	public List<Expense> findAll(){
		return expenseStore.findAll();
	}
}
