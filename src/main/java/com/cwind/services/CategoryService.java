package com.cwind.services;

import java.util.List;

import com.cwind.entity.Category;
import com.cwind.entity.ExpenseType;
import com.cwind.store.HibernateCategoryStore;
import com.cwind.store.HibernateExpenseTypeStore;

public class CategoryService {
	private HibernateCategoryStore categoryStore;
	private HibernateExpenseTypeStore expenseTypeStore;
	
	public HibernateExpenseTypeStore getExpenseTypeStore() {
		return expenseTypeStore;
	}

	public void setExpenseTypeStore(HibernateExpenseTypeStore expenseTypeStore) {
		this.expenseTypeStore = expenseTypeStore;
	}

	public HibernateCategoryStore getCategoryStore() {
		return categoryStore;
	}

	public void setCategoryStore(HibernateCategoryStore categoryStore) {
		this.categoryStore = categoryStore;
	}

	public Category getCategory(Integer id){
		return categoryStore.get(id);
	}
	
	public Integer saveCategory(Category user){
		return categoryStore.save(user);
	}
	
	public void updateCategory(Category user){
		categoryStore.update(user);
	}
	
	public void deleteCategory(Category user){
		categoryStore.delete(user);
	}
	
	public void deleteCategory(Integer id){
		categoryStore.delete(id);
	}
	
	public List<Category> findAllCategories(){
		return categoryStore.findAll();
	}
	
	public ExpenseType getExpenseType(Integer id){
		return expenseTypeStore.get(id);
	}
	
	public Integer saveExpenseType(ExpenseType expenseType){
		return expenseTypeStore.save(expenseType);
	}
	
	public void updateExpenseType(ExpenseType expenseType){
		expenseTypeStore.update(expenseType);
	}
	
	public void deleteExpenseType(ExpenseType expenseType){
		expenseTypeStore.delete(expenseType);
	}
	
	public void deleteExpenseType(Integer id){
		expenseTypeStore.delete(id);
	}
	
	public List<ExpenseType> findAllExpenseTypes(){
		return expenseTypeStore.findAll();
	}
	
	public List<ExpenseType> findExpenseTypeByCategory(Integer category_id){
		return expenseTypeStore.findByCategoryId(category_id);
	}
}
