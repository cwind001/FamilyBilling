package com.cwind.services;

import com.cwind.store.HibernateFundAccountStore;
import com.cwind.store.HibernateFundBalanceStore;

public class FundAccountService {
	private HibernateFundAccountStore fundAccountStore;
	private HibernateFundBalanceStore fundBalanceStore;
	
	public HibernateFundAccountStore getFundAccountStore() {
		return fundAccountStore;
	}
	public void setFundAccountStore(HibernateFundAccountStore fundAccountStore) {
		this.fundAccountStore = fundAccountStore;
	}
	
	public HibernateFundBalanceStore getFundBalanceStore() {
		return fundBalanceStore;
	}
	public void setFundBalanceStore(HibernateFundBalanceStore fundBalanceStore) {
		this.fundBalanceStore = fundBalanceStore;
	}
	
	
}
