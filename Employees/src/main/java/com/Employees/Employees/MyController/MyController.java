package com.Employees.Employees.MyController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Employees.Employees.Services.CourseService;
import com.Employees.Employees.entities.Course;

@RestController
public class MyController {

	@Autowired
	private CourseService courseservice;
	
	
	@GetMapping("/home")
	public String home(){
		return "This is home page";
	}
	
	//get the courses
	
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return this.courseservice.getCourses();
	}
	
	@GetMapping("/Courses/{CourseId}")
	public Course getCourse(@PathVariable String courseId)
	{
		return this.courseservice.getCourse(Long.parseLong(courseId));
	}
	
}
