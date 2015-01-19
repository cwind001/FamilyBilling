package com.cwind.store;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.cwind.entity.ExpenseType;

public class HibernateExpenseTypeStore extends HibernateDaoSupport implements
		AbstractStore<ExpenseType> {
	private static final Log log = LogFactory.getLog(HibernateExpenseTypeStore.class);
	
	public static final String CATEGORY_ID = "category_id";
	
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

	public List<ExpenseType> findByProperty(String propertyName, Object value) {
		log.debug("finding ExpenseType instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ExpenseType as model where model."
					+ propertyName + "= ?";
			return (List<ExpenseType>) getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}
	
	public List<ExpenseType> findByCategoryId(Object category_id){
		return findByProperty(CATEGORY_ID, category_id);
	}
}
