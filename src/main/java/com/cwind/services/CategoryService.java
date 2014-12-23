package com.cwind.services;

import java.util.List;

import com.cwind.entity.Category;
import com.cwind.store.CategoryStore;

public class CategoryService {
	private CategoryStore categoryStore;
	
	public CategoryStore getCategoryStore() {
		return categoryStore;
	}

	public void setCategoryStore(CategoryStore categoryStore) {
		this.categoryStore = categoryStore;
	}

	public Category get(Integer id){
		return categoryStore.get(id);
	}
	
	public Integer save(Category user){
		return categoryStore.save(user);
	}
	
	public void update(Category user){
		categoryStore.update(user);
	}
	
	public void delete(Category user){
		categoryStore.delete(user);
	}
	
	public void delete(Integer id){
		categoryStore.delete(id);
	}
	
	public List<Category> findAll(){
		return categoryStore.findAll();
	}
}
