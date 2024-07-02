package com.service;

import com.model.Admin;

public interface AdminService {
	
	public Admin saveAdmin(Admin a);
	
	public Admin getAdmin(int id);
	
	public Admin Login(String email,String Password);
}
