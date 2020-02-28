package io.codesingh.springbootquickstart.course;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String id){
		//return course;
		List<Course> courses = new ArrayList<>();
		courseRepository.findAll().forEach(e->courses.add(e));
		return courses;
	}
	
	public Course getCourse(String id) {
		return courseRepository.findOne(id);
	}
	
	public void addCourse(Course course) {
		courseRepository.save(course);
	}
	
	public void updateCourse(Course course) {
		courseRepository.save(course);
	}
	
	public void deleteCourse(String id) {
		courseRepository.delete(id);
	}
}
