package com.cwind.util;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.cwind.entity.Expenses;
import com.cwind.services.ExpenseService;

/**
 * This is a one time migration tool,
 * which migrates account info from  
 * @author Administrator
 */

public class MigrateFundAccounts {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext(
				new String[] {"src/main/resources/applicationContext.xml"});
		
		ExpenseService es = (ExpenseService) context.getBean("ExpenseService");
		
		List<Expenses> fundInExpenses = es.findExpensesByCategory(4); 
		for(Expenses expense : fundInExpenses) {
			System.out.println(expense.getExpenseType_id() + ", " +expense.getTitle()+", " + expense.getPrice());
		}
		
	}
}
