package com.cwind.services;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.cwind.entity.Category;
import com.cwind.entity.ExpenseType;

public class TestCategoryService {
	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext(
				new String[] { "src/main/resources/applicationContext.xml" });

		CategoryService cs = (CategoryService) context.getBean("CategoryService");
		Category tmpCategory = new Category();
		tmpCategory.setDisplayname("资产");
//		cs.saveCategory(tmpCategory);
		
		List<Category> categoryList = cs.findAllCategories();
		for (int i = 0; i < categoryList.size(); i++) {
			tmpCategory = categoryList.get(i);
			ExpenseType tmpType = new ExpenseType();
			tmpType.setDisplayname("TempType" + i);
			tmpType.setCategory_id(tmpCategory.getId());
			cs.saveExpenseType(tmpType);
			System.out.println(tmpCategory.getId() + ", " + tmpCategory.getDisplayname());
		}
	}
}
