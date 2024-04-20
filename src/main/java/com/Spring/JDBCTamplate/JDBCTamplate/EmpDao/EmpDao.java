package com.Spring.JDBCTamplate.JDBCTamplate.EmpDao;


import java.util.List;

import com.Spring.JDBCTamplate.JDBCTamplate.Entity.Employee;

public interface EmpDao {
	
	public int insert(Employee emp);
	public int change(Employee emp);
	public int delete(Employee emp);
	public Employee GetEmp(int eid);
	public List<Employee> GetAllEmp();
	
	

	
	
	
}

