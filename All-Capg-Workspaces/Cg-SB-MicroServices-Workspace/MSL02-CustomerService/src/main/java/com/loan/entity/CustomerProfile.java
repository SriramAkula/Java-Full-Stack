package com.loan.entity;

import java.util.List;

public class CustomerProfile {
	
	private Customer customer;
	
	private List<LoanResponse> loans;
	
	private List<DematAccountResponse> dematAccs;

	public CustomerProfile() {
		
	}
	
	public CustomerProfile(Customer customer, List<LoanResponse> loans, List<DematAccountResponse> dematAccs) {
		super();
		this.customer = customer;
		this.loans = loans;
		this.dematAccs = dematAccs;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<LoanResponse> getLoans() {
		return loans;
	}

	public void setLoans(List<LoanResponse> loans) {
		this.loans = loans;
	}

	public List<DematAccountResponse> getDematAccs() {
		return dematAccs;
	}

	public void setDematAccs(List<DematAccountResponse> dematAccs) {
		this.dematAccs = dematAccs;
	}
	
	
	
}
