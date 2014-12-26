package com.cwind.store;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.cwind.entity.Expenses;
import com.cwind.entity.ExpenseType;

public class HibernateExpenseStore extends HibernateDaoSupport implements
		ExpenseStore {
	private static final Log log = LogFactory.getLog(HibernateExpenseStore.class);
	
	public Expenses get(Integer id) {
		log.debug("get expense by id: " + id);
		return getHibernateTemplate().get(Expenses.class, id);
	}

	public Integer save(Expenses expense) {
		return (Integer) getHibernateTemplate().save(expense);
	}

	public void update(Expenses expense) {
		getHibernateTemplate().update(expense);
	}

	public void delete(Expenses expense) {
		getHibernateTemplate().delete(expense);
	}

	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	public List<Expenses> findAll() {
		String queryStr = "from Expenses";
		return (List<Expenses>) getHibernateTemplate().find(queryStr);
	}
}
