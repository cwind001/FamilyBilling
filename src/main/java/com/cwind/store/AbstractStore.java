package com.cwind.store;

import java.util.List;

/**
 * Abstract store with CRUD method defination
 * 2015/1/19
 * @author billchen01@163.com
 */

public interface AbstractStore<T> {
	T get(Integer id);
	Integer save(T obj);
	void update(T obj);
	void delete(T obj);
	void delete(Integer id);
	List<T> findAll();
	List<T> findByProperty(String propertyName, Object value);
}
