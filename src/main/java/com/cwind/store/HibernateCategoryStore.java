package com.cwind.store;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.cwind.entity.Category;

public class HibernateCategoryStore extends HibernateDaoSupport implements
		AbstractStore<Category> {
	private static final Log log = LogFactory.getLog(HibernateCategoryStore.class);
	
	public Category get(Integer id) {
		log.debug("Get category by id: " + id);
		return getHibernateTemplate().get(Category.class, id);
	}

	public Integer save(Category category) {
		return (Integer) getHibernateTemplate().save(category);
	}

	public void update(Category category) {
		getHibernateTemplate().update(category);
	}

	public void delete(Category category) {
		getHibernateTemplate().delete(category);
	}

	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	public List<Category> findAll() {
		String queryStr = "from Category";
		return (List<Category>) getHibernateTemplate().find(queryStr);
	}

	@Override
	public List<Category> findByProperty(String propertyName, Object value) {
		return null;
	}
}
