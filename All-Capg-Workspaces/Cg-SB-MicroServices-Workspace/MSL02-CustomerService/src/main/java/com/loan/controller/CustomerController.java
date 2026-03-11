package com.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loan.entity.Customer;
import com.loan.entity.CustomerProfile;
import com.loan.entity.DematAccountResponse;
import com.loan.entity.LoanResponse;
import com.loan.external.client.DematFeignClient;
import com.loan.external.client.LoanFeignClient;
import com.loan.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@Autowired
	private LoanFeignClient loanClient;
	
	@Autowired
	private DematFeignClient dematClient;
	
	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.createCustomer(customer);
	}
	
	@GetMapping("/getCustomer/{id}")
	public Customer getCustomerById(@PathVariable int id) {
		return service.getCustomerById(id);
	}
	
	@GetMapping("/getallcustomers")
	public List<Customer> getAllCustomers(){
		return service.getAllCustomers();
	}
	
	@DeleteMapping("/deletecustomer/{id}")
	public String deleteCustomer(@PathVariable int id) {
		service.deleteCustomer(id);
		return "Customer deleted successfully";
	}
	
	@GetMapping("/{customerId}")
    public CustomerProfile getCustomerProfile(@PathVariable int customerId){
		List<LoanResponse> loans = loanClient.getLoansByCustomer(customerId);
		List<DematAccountResponse> dematAccs = dematClient.getAccountsByCustomer(customerId);
		Customer customer = getCustomerById(customerId);
		
		CustomerProfile cp = new CustomerProfile(customer,loans,dematAccs);
		return cp;
	}
}
