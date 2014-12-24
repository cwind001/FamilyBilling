package com.cwind.services;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.cwind.entity.Category;

public class TestCategoryService {
	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext(
				new String[] { "src/main/resources/applicationContext.xml" });

		CategoryService cs = (CategoryService) context.getBean("CategoryService");
		Category tmpCategory = new Category();
		tmpCategory.setDisplayname("资产");
		cs.save(tmpCategory);
		
		List<Category> categoryList = cs.findAll();
		for (int i = 0; i < categoryList.size(); i++) {
			tmpCategory = categoryList.get(i);
			System.out.println(tmpCategory.getId() + ", " + tmpCategory.getDisplayname());
		}
	}
}
