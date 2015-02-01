package com.cwind.store;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.cwind.entity.FundAccount;

public class HibernateFundAccountStore extends HibernateDaoSupport implements
	AbstractStore<FundAccount> {

	public FundAccount get(Integer id) {
		return getHibernateTemplate().get(FundAccount.class, id);
	}

	public Integer save(FundAccount obj) {
		return (Integer) getHibernateTemplate().save(obj);
	}

	public void update(FundAccount obj) {
		getHibernateTemplate().update(obj);
	}

	public void delete(FundAccount obj) {
		getHibernateTemplate().delete(obj);
	}

	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}
	
	public List<FundAccount> findAll() {
		String queryStr = "from FundAccount";
		return (List<FundAccount>) getHibernateTemplate().find(queryStr);
	}

	@Override
	public List<FundAccount> findByProperty(String propertyName, Object value) {
		return null;
	}

}
