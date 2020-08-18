package com.maljlk.demoapp.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maljlk.demoapp.dao.EmployeeDAO;
import com.maljlk.demoapp.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	// define field for entitymanager	
	private EmployeeDAO employeeDAO;
		
	// set up constructor injection
	@Autowired
	public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO) {
		employeeDAO = theEmployeeDAO;
	}
			
	@Override
	@Transactional
	public List<Employee> findAll() {
			
		return employeeDAO.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int theId) {
		return employeeDAO.findById(theId);
	}

	@Override
	@Transactional
	public void save(Employee theEmployee) {
		employeeDAO.save(theEmployee);

	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		employeeDAO.deleteById(theId);

	}

}
