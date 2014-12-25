package com.cwind.store;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.cwind.entity.ExpenseType;

public class HibernateExpenseTypeStore extends HibernateDaoSupport implements
		ExpenseTypeStore {
	private static final Log log = LogFactory.getLog(HibernateExpenseTypeStore.class);
	
	public ExpenseType get(Integer id) {
		log.debug("get expense type by id: " + id);
		return getHibernateTemplate().get(ExpenseType.class, id);
	}

	public Integer save(ExpenseType expenseType) {
		return (Integer) getHibernateTemplate().save(expenseType);
	}

	public void update(ExpenseType expenseType) {
		getHibernateTemplate().update(expenseType);
	}

	public void delete(ExpenseType expenseType) {
		getHibernateTemplate().delete(expenseType);
	}

	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	public List<ExpenseType> findAll() {
		String queryStr = "from ExpenseType";
		return (List<ExpenseType>) getHibernateTemplate().find(queryStr);
	}

	public List<ExpenseType> findByCriteria(Criteria criteria) {
		//TODO
		return null;
	}
}
