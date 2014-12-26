package com.cwind.services;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.cwind.entity.Category;
import com.cwind.entity.ExpenseType;
import com.cwind.meta.Meta;

public class TestCategoryService {
	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext(
				new String[] { "src/main/resources/applicationContext.xml" });

		CategoryService cs = (CategoryService) context.getBean("CategoryService");
		ExpenseType tmpCategory = new ExpenseType();
		
		List<ExpenseType> categoryList = cs.findExpenseTypeByCategory(Meta.CATEGORY_EXPENSE);
		for (int i = 0; i < categoryList.size(); i++) {
			tmpCategory = categoryList.get(i);
			System.out.println(tmpCategory.getId() + ", " + tmpCategory.getDisplayname());
		}
	}
}
