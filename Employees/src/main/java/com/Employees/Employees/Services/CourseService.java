package com.Employees.Employees.Services;

import java.util.List;

import com.Employees.Employees.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	
	public Course getCourse(long courseId);
	
}
