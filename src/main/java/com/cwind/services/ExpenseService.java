package com.cwind.services;

import java.util.List;

import com.cwind.entity.Expenses;
import com.cwind.store.ExpenseStore;

public class ExpenseService {
	private ExpenseStore expenseStore;

	public ExpenseStore getExpenseStore() {
		return expenseStore;
	}

	public void setExpenseStore(ExpenseStore expenseStore) {
		this.expenseStore = expenseStore;
	}

	public Expenses get(Integer id){
		return expenseStore.get(id);
	}
	
	public Integer save(Expenses expense){
		return expenseStore.save(expense);
	}
	
	public void update(Expenses expense){
		expenseStore.update(expense);
	}
	
	public void delete(Expenses expense){
		expenseStore.delete(expense);
	}
	
	public void delete(Integer id){
		expenseStore.delete(id);
	}
	
	public List<Expenses> findAll(){
		return expenseStore.findAll();
	}
}
