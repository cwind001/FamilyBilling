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
	public static final String EXPENSE_TYPE_ID = "expenseType_id";
	
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

	public List<Expenses> findByProperty(String propertyName, Object value) {
		log.debug("finding Expenses instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Expenses as model where model."
					+ propertyName + "= ?";
			return (List<Expenses>) getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}
	
	@Override
	public List<Expenses> findByTypeId(Object expenseType_id) {
		return findByProperty(EXPENSE_TYPE_ID, expenseType_id);
	}
}
