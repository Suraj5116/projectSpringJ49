package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.TransactionService;



@RestController
@RequestMapping("/transaction")
public class TransactionController {
	
	@Autowired
	private TransactionService trService;
	

}
