package com.springPr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springPr.dao.EmployeeDao;
import com.springPr.model.Employee;
import com.springPr.model.User;

@Service
public class EmServiceImpl implements EmService{
	
	@Autowired
	private EmployeeDao employeeDao;
	
     public int register(Employee employee) {
    	 int i= employeeDao.saveEmployee(employee);
    	 return i;
     }
     
     public Employee validateUser( User user) {
		Employee i = employeeDao.validateUser(user);
    	 return i;
     }
     
//     public User validateUser(User user) {
//    	Employee u= employeeDao.validateUser(user);
//		return user;
//    	 
//     }
}
