package com.cwind.services;

import java.util.ArrayList;
import java.util.List;

import com.cwind.entity.ExpenseType;
import com.cwind.entity.Expenses;
import com.cwind.store.ExpenseStore;
import com.cwind.store.ExpenseTypeStore;

public class ExpenseService {
	private ExpenseStore expenseStore;
	private ExpenseTypeStore expenseTypeStore;

	public ExpenseStore getExpenseStore() {
		return expenseStore;
	}

	public void setExpenseStore(ExpenseStore expenseStore) {
		this.expenseStore = expenseStore;
	}
	
	public ExpenseTypeStore getExpenseTypeStore() {
		return expenseTypeStore;
	}

	public void setExpenseTypeStore(ExpenseTypeStore expenseTypeStore) {
		this.expenseTypeStore = expenseTypeStore;
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
	
	public List<Expenses> findExpensesByCategory(Integer category_id){
		List<ExpenseType> expenseTypes = expenseTypeStore.findByCategoryId(category_id);
		List<Expenses> expenses = new ArrayList<Expenses>();
		for (ExpenseType type : expenseTypes){
			expenses.addAll(expenseStore.findByTypeId(type.getId()));
		}
		return expenses;
	}
}
