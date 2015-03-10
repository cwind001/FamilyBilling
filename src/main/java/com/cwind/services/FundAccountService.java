package com.cwind.services;

import java.util.List;

import com.cwind.entity.FundAccount;
import com.cwind.entity.FundBalance;
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
	
	public FundAccount getFundAccount(Integer id) {
		return fundAccountStore.get(id);
	}
	
	public void saveFundAccount(FundAccount account) { 
		fundAccountStore.save(account);
	}
	
	public void updateFundAccount(FundAccount account) {
		fundAccountStore.update(account);
	}
	
	public void deleteFundAccount(FundAccount account) {
		fundAccountStore.delete(account);
	}
	
	public void deleteFundAccount(Integer id) {
		fundAccountStore.delete(id);
	}
	
	public List<FundAccount> getFundAccountList() {
		return fundAccountStore.findAll();
	}
	
	public FundBalance getFundBalance(Integer id) {
		return fundBalanceStore.get(id);
	}
	
	public void saveFundBalance(FundBalance balance) {
		fundBalanceStore.save(balance);
	}
	
	public void updateFundBalance(FundBalance balance) {
		fundBalanceStore.update(balance);
	}
	
	public void deleteFundBalance(FundBalance balance) {
		fundBalanceStore.delete(balance);
	}
	
	public void deleteFundBalance(Integer id) {
		fundBalanceStore.delete(id);
	}
	
	public List<FundBalance> getFundBalanceList() {
		return fundBalanceStore.findAll();
	}
}
