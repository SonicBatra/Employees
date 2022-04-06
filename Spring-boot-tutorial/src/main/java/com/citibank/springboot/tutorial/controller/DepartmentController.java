package com.citibank.springboot.tutorial.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.citibank.springboot.tutorial.entity.Department;
import com.citibank.springboot.tutorial.service.DepartmentService;


@RestController
public class DepartmentController {
	
	private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/departments")
	public Department saveDepartment(@RequestBody Department department ){
		LOGGER.info("Saving department records");
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/departments")
	public List<Department> fetchDepartmentList(){
		LOGGER.info("Getting department records");
		return departmentService.fetchDepartmentList();
	}
	
	@GetMapping("/departments/{Id}")
	public Department fetchDepartmentById(@PathVariable("Id") Long departmentId){
		LOGGER.info("Getting department records");
		return departmentService.fetchDepartmentById(departmentId);
	}
	
	@DeleteMapping("/departments/{Id}")
	public String deleteDepartmentById(@PathVariable("Id") Long departmentId){
		departmentService.deleteDepartmentById(departmentId);
		return "Department deleted successfully!!";
	}
	
	
	@PutMapping("/departments/{Id}")
	public Department updateDepartment(@PathVariable("Id") Long departmentId, 
			@RequestBody Department department){
		return departmentService.updateDepartment(departmentId,department);
	}
	
}
