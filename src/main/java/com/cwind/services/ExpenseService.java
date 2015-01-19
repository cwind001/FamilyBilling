package com.cwind.services;

import java.util.ArrayList;
import java.util.List;

import com.cwind.entity.ExpenseType;
import com.cwind.entity.Expenses;
import com.cwind.store.HibernateExpenseStore;
import com.cwind.store.HibernateExpenseTypeStore;

public class ExpenseService {
	private HibernateExpenseStore expenseStore;
	private HibernateExpenseTypeStore expenseTypeStore;

	public HibernateExpenseStore getExpenseStore() {
		return expenseStore;
	}

	public void setExpenseStore(HibernateExpenseStore expenseStore) {
		this.expenseStore = expenseStore;
	}
	
	public HibernateExpenseTypeStore getExpenseTypeStore() {
		return expenseTypeStore;
	}

	public void setExpenseTypeStore(HibernateExpenseTypeStore expenseTypeStore) {
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
