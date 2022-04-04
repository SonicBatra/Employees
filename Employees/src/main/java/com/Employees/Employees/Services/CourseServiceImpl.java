package com.Employees.Employees.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Employees.Employees.entities.Course;


@Service
public class CourseServiceImpl implements CourseService{
	
	List<Course> list;
	
	

	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(145, "Java", "this is basic"));
		list.add(new Course(4343, "Spring boot", "this is advance"));
	}



	@Override
	public List<Course> getCourses() {
		return list;
	}



	@Override
	public Course getCourse(long courseId) {
		Course c = null;
		for (Course course:list){
			if (course.getId()==courseId)
			{
				c = course;
				break;
			}
		}
		
		return c;
	}

}
