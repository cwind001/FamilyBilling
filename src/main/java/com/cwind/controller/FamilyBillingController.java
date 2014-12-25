package com.cwind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cwind.entity.Category;
import com.cwind.entity.ExpenseType;
import com.cwind.entity.User;
import com.cwind.services.CategoryService;
import com.cwind.services.ExpenseService;
import com.cwind.services.UserService;

@Controller
@RequestMapping("billing")
public class FamilyBillingController {
	
	@Autowired
	private UserService userService;

	@Autowired
	private CategoryService categoryService;
	
	@Autowired 
	private ExpenseService expenseService;
	
	@RequestMapping(value="/category/categoryList", method=RequestMethod.GET)
	@ResponseBody
	public List<Category> getCategories() {
		List<Category> categories = categoryService.findAllCategories();
		return categories;
	}
	
	@RequestMapping(value="/category/add", method=RequestMethod.PUT)
	@ResponseBody
	public List<Category> addCategory(@RequestBody Category category){
		categoryService.saveCategory(category);
		List<Category> categories = categoryService.findAllCategories();
		return categories;
	}
	
	@RequestMapping(value="/expenseType/typeList", method=RequestMethod.GET)
	@ResponseBody
	public List<ExpenseType> getExpenseTypes() {
		List<ExpenseType> expenseTypes = categoryService.findAllExpenseTypes();
		return expenseTypes;
	}
	
	@RequestMapping(value="/expenseType/add", method=RequestMethod.PUT)
	@ResponseBody
	public List<ExpenseType> addExpenseType(@RequestBody ExpenseType expenseType) {
		categoryService.saveExpenseType(expenseType);
		List<ExpenseType> expenseTypes = categoryService.findAllExpenseTypes();
		return expenseTypes;
	}
	
	@RequestMapping(value="/expenseType/update", method=RequestMethod.POST)
	@ResponseBody
	public List<ExpenseType> updateExpenseType(@RequestBody ExpenseType expenseType){
		categoryService.updateExpenseType(expenseType);
		List<ExpenseType> expenseTypes = categoryService.findAllExpenseTypes();
		return expenseTypes;
	}

	@RequestMapping(value="/expenseType/delete/{id}", method=RequestMethod.DELETE)
	@ResponseBody
	public List<ExpenseType> deleteExpenseType(@PathVariable String id){
		if(id != null){
			categoryService.deleteExpenseType(Integer.valueOf(id));	
		}
		List<ExpenseType> expenseTypes = categoryService.findAllExpenseTypes();
		return expenseTypes;
	}
	
	@RequestMapping(value="/account/userList", method=RequestMethod.GET)
	@ResponseBody
	public List<User> getAllUsers() { 
		List<User> users = userService.findAll();
		return users;
	}

	@RequestMapping(value="/account/add", method=RequestMethod.PUT)
	@ResponseBody
	public List<User> addUser(@RequestBody User user){
		userService.save(user);
		List<User> users = userService.findAll();
		return users;
	}
	
	@RequestMapping(value="/account/update", method=RequestMethod.POST)
	@ResponseBody
	public List<User> updateUser(@RequestBody User user){
		userService.update(user);
		List<User> users = userService.findAll();
		return users;
	}

	@RequestMapping(value="/account/delete/{id}", method=RequestMethod.DELETE)
	@ResponseBody
	public List<User> deleteUser(@PathVariable String id){
		if(id != null){
			userService.delete(Integer.valueOf(id));	
		}
		List<User> users = userService.findAll();
		return users;
	}
}
