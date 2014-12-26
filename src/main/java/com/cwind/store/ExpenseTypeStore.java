package com.cwind.store;

import java.util.List;

import com.cwind.entity.ExpenseType;

/**
 * CRUD method defination for ExpenseType
 * 2014/12/6
 * @author billchen01@163.com
 */

public interface ExpenseTypeStore {
	ExpenseType get(Integer id);
	Integer save(ExpenseType expenseType);
	void update(ExpenseType expenseType);
	void delete(ExpenseType expenseType);
	void delete(Integer id);
	List<ExpenseType> findAll();
	List<ExpenseType> findByProperty(String propertyName, Object value);
	public List<ExpenseType> findByCategoryId(Object category_id);
}
