package com.loan.external.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.loan.entity.DematAccountResponse;

@FeignClient(name = "DematAccountService")
public interface DematFeignClient {
	
	@GetMapping("/demat/customer/{customerId}")
    public List<DematAccountResponse> getAccountsByCustomer(@PathVariable int customerId);
	
}
