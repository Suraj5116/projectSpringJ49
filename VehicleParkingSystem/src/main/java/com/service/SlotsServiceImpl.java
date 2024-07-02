package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.SlotsRepository;

@Service
public class SlotsServiceImpl implements SlotsService {

	@Autowired
	private SlotsRepository sRepo;
	


}
