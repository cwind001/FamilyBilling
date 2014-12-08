package com.cwind.store;

import java.util.List;

import com.cwind.entity.Expense;

/**
 * CRUD method defination for Expense
 * 2014/12/6
 * @author billchen01@163.com
 */

public interface ExpenseStore {
	Expense get(Integer id);
	Integer save(Expense expense);
	void update(Expense expense);
	void delete(Expense expense);
	void delete(Integer id);
	List<Expense> findAll();
}
