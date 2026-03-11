package com.loan.external.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.loan.entity.LoanResponse;



@FeignClient(name = "LoanService")
public interface LoanFeignClient {
	
	@GetMapping("/loan/customer/{customerId}")
    public List<LoanResponse> getLoansByCustomer(@PathVariable int customerId);
	
}
