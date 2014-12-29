package com.cwind.store;

import java.util.List;

import com.cwind.entity.Expenses;

/**
 * CRUD method defination for Expense
 * 2014/12/6
 * @author billchen01@163.com
 */

public interface ExpenseStore {
	Expenses get(Integer id);
	Integer save(Expenses expense);
	void update(Expenses expense);
	void delete(Expenses expense);
	void delete(Integer id);
	List<Expenses> findAll();
	public List<Expenses> findByTypeId(Object expenseType_id);
}
