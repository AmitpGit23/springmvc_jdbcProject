package com.springPr.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springPr.model.Employee;
import com.springPr.model.User;


@Repository
public class EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int saveEmployee(Employee employee)
	{
		String sql="insert into Employee1(name,dob,gender,address,city,state,username,password) values(?,?,?,?,?,?,?,?) ";
		int i=jdbcTemplate.update(sql, employee.getName(),employee.getDob(),employee.getGender(),employee.getAddress(),employee.getCity(),employee.getState(),employee.getUsername(),employee.getPassword());
		return i;
	}
	public Employee validateUser(User user)
	{
		String sql ="select * from Employee1 where username='"+user.getUsername()+"' and password= '"+user.getPassword()+"' ";
		List<Employee> employees =jdbcTemplate.query(sql,new UserMapper());
		return employees.size() > 0 ? employees.get(0):null;
	}
	class UserMapper implements RowMapper<Employee>{
		public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
			Employee employee=new Employee();
			
			employee.setName(rs.getString("name"));
			employee.setDob(rs.getString("dob"));
			employee.setGender(rs.getString("gender"));
			employee.setAddress(rs.getString("Address"));
			employee.setCity(rs.getString("city"));
			employee.setState(rs.getString("state"));
			employee.setUsername(rs.getString("username"));
			employee.setPassword(rs.getString("password"));
			return employee;
		}
	}

}
