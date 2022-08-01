package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Employee;

@RestController
@RequestMapping(value = "/v1")
public class EmployeeController {
	
	//@RequestMapping(value = "/hye", method = RequestMethod.GET)
	@GetMapping("/hye")
	public String getApplicationDeveloperName() {
		return "GL India";
		
		
	}
	
	//@RequestMapping(value = "/employee", method = RequestMethod.GET)
	@GetMapping("/employee")
	public Employee getEmployee() {
		return new Employee(102, "GL India", 25000.0);
	}
	
	//@RequestMapping(value = "/employee", method = RequestMethod.POST)
		@PostMapping("/employee")
		public void createEmployee(@RequestBody Employee employee) {

			System.out.println("Posted new Employee:" + employee);

		}
		
		//@RequestMapping(value = "/employee", method = RequestMethod.PUT)
		@PutMapping("/employee")
		public void updateEmployee(@RequestBody Employee employee) {

			System.out.println("Update Employee:" + employee);

		}
		
		//@RequestMapping(value = "/employee/{empId}", method = RequestMethod.DELETE)
		@DeleteMapping("/employee/{empId}")
		public void deleteEmployee(@PathVariable("empId") Integer employeeId) {

			System.out.println("Delete Employee id:" + employeeId);

		}
		
}
