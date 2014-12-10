package com.cwind.store;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.cwind.entity.Expense;

public class HibernateExpenseStore extends HibernateDaoSupport implements
		ExpenseStore {
	private static final Log log = LogFactory.getLog(HibernateExpenseStore.class);
	
	public Expense get(Integer id) {
		log.debug("get expense by id: " + id);
		return getHibernateTemplate().get(Expense.class, id);
	}

	public Integer save(Expense expense) {
		return (Integer) getHibernateTemplate().save(expense);
	}

	public void update(Expense expense) {
		getHibernateTemplate().update(expense);
	}

	public void delete(Expense expense) {
		getHibernateTemplate().delete(expense);
	}

	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	public List<Expense> findAll() {
		String queryStr = "from Expenses";
		return (List<Expense>) getHibernateTemplate().find(queryStr);
	}

}
