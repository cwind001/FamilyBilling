package com.cwind.store;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.cwind.entity.User;

public class HibernateUserStore extends HibernateDaoSupport implements UserStore{
	private static final Log log = LogFactory.getLog(HibernateUserStore.class);
	
	public User get(Integer id) {
		log.debug("get user by id: " + id);
		return getHibernateTemplate().get(User.class, id);
	}

	public Integer save(User user) {
		return (Integer) getHibernateTemplate().save(user);
	}

	public void update(User user) {
		getHibernateTemplate().update(user);
	}

	public void delete(User user) {
		getHibernateTemplate().delete(user);
	}

	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	public List<User> findAll() {
		String queryStr = "from User";
		return (List<User>) getHibernateTemplate().find(queryStr);
	}
	
}
