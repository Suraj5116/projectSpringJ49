package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AdminRepository;
import com.model.Admin;

@Service
public class AdminServiceimpl implements AdminService {

	@Autowired
	private AdminRepository aRepo;

	@Override
	public Admin saveAdmin(Admin a) {
		// TODO Auto-generated method stub
		return aRepo.save(a);
	}

	@Override
	public Admin getAdmin(int id) {
		// TODO Auto-generated method stub
		return aRepo.findById(id).orElse(null);
	}

	@Override
	public Admin Login(String email, String password) {
		Admin a = new Admin();
		if(a.getEmail == email) {
			
			if(a.getPassword == password) {
				
				System.out.println("Correct p");
				return a;
			}else {
				System.out.println("Please check Email...");
			}
		}
		return null;
	}

	

}
