package com.rt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.dao.EmployeeDao;
import com.rt.entity.Employee;
@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao empDao;

	public boolean addData(Employee e){
		
		
		return empDao.addData(e);
		
	}

	public boolean updatedata(Employee e) {
		
		return empDao.updatedata(e);
		
	}

	public Employee singledata(int id) {
		
		return empDao.singledata(id);
		
	}

	public boolean deletedata(int id) {
		
		return empDao.deletedata(id);
		
	}

	public List<Employee> selectAll() {
		return empDao.selectAll();
		
	}

	

}
