package com.Spring.JDBCTamplate.JDBCTamplate.EmpDao;
													


import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.Spring.JDBCTamplate.JDBCTamplate.Entity.Employee;
public class EmployeeImp implements EmpDao {

	
	private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(Employee emp) {
		String query="insert into Employee(name,salary)values(?,?)";
		int r=this.jdbcTemplate.update(query,emp.getName(),emp.getSalary());
		return r;
	}

	@Override
	public int change(Employee emp) {
		String query="update Employee set name=?,salary=? where id=?";
		int r=this.jdbcTemplate.update(query,emp.getName(),emp.getSalary(),emp.getId());
		return r;
	
	}

	

	@Override
	public int delete(Employee emp) {
		String query="delete from Employee where id=?";
		int r=this.jdbcTemplate.update(query,emp.getId());
		return r;
	
	}

	@Override
	public Employee GetEmp(int eid) {
		String query="select * from Employee where id=?";
		RowMapper<Employee> rowMapper=new RowMapperImp();
		Employee emp=this.jdbcTemplate.queryForObject(query,rowMapper,eid);
		return emp;
	}

	@Override
	public List<Employee> GetAllEmp() {
		String query="select * from Employee";
		List<Employee>emp=this.jdbcTemplate.query(query, new RowMapperImp());
		return emp;
	}


	
}
