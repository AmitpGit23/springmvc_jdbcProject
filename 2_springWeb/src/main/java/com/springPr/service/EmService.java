package com.springPr.service;

import com.springPr.model.Employee;
import com.springPr.model.User;

public interface EmService {
	public int register(Employee employee);
	
    public Employee validateUser(User user);

//	public User validateUser(User user);

}
