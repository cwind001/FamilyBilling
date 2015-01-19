package com.cwind.services;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.cwind.entity.Expenses;

public class TestExpenseService {
	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext(
				new String[] { "src/main/resources/applicationContext.xml" });

		ExpenseService es = (ExpenseService) context.getBean("ExpenseService");
		Expenses tmpExpense = new Expenses();
		
		List<Expenses> expenses = es.findAll();
		for (int i = 0; i < expenses.size(); i++) {
			tmpExpense = expenses.get(i);
			System.out.println(tmpExpense.getId() + ", " + tmpExpense.getTitle() + ", " + tmpExpense.getPrice());
		}
	}
}
