package com.Spring.JDBCTamplate.JDBCTamplate;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Spring.JDBCTamplate.JDBCTamplate.EmpDao.EmpDao;
import com.Spring.JDBCTamplate.JDBCTamplate.Entity.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	  
    	ApplicationContext context=new ClassPathXmlApplicationContext("Spring_cfg.xml");
    	EmpDao empdao= context.getBean("edao",EmpDao.class);
    	
    	
//    	Employee e=empdao.GetEmp(104);
//    	System.out.println("the emp is:="+e);
    	
//    	List<Employee> e=empdao.GetAllEmp();
//    	for(Employee emp:e) {
//    		System.out.println(emp);
//    	}
//    	
    	
    	
    	
 	
    	//save the data in the database
//    	Employee emp2=new Employee();
//    	emp2.setName("satish");
//    	emp2.setSalary(5000);
//    	int result= empdao.insert(emp2);
//    	System.out.println("the employee is added"+result);
    	
    	
    	//Update the data 
//    	Employee emp3=new Employee();
//    	emp3.setName("manisa");
//    	emp3.setSalary(3000);
//    	emp3.setId(103);
//    	int r=empdao.change(emp3);
//    	System.out.println("the data is updated successfully");
//    	
    	
    	//delete the data 
//    	Employee emp=new Employee();
//    	emp.setId(103);
//    	int del=empdao.delete(emp);
//    	System.out.println("the data is deleted"+del);
//    	
    	
    	
  
    }
}