package com.cwind.store;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.cwind.entity.FundBalance;

public class HibernateFundBalanceStore extends HibernateDaoSupport implements 
	AbstractStore<FundBalance> {

	public FundBalance get(Integer id) {
		return getHibernateTemplate().get(FundBalance.class, id);
	}

	public Integer save(FundBalance obj) {
		return (Integer) getHibernateTemplate().save(obj);
	}

	public void update(FundBalance obj) {
		getHibernateTemplate().update(obj);
	}

	public void delete(FundBalance obj) {
		getHibernateTemplate().delete(obj);
	}

	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	public List<FundBalance> findAll() {
		String queryStr = "from FundBalance";
		return (List<FundBalance>) getHibernateTemplate().find(queryStr);
	}

	@Override
	public List<FundBalance> findByProperty(String propertyName, Object value) {
		return null;
	}

}
