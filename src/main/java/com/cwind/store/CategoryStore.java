package com.cwind.store;

import java.util.List;

import com.cwind.entity.Category;

/**
 * CRUD method defination for Category
 * 2014/12/6
 * @author billchen01@163.com
 */

public interface CategoryStore {
	Category get(Integer id);
	Integer save(Category category);
	void update(Category category);
	void delete(Category category);
	void delete(Integer id);
	List<Category> findAll();
}
