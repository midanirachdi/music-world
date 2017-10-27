package services;

import java.util.List;

import javax.ejb.Local;

import entities.Course;
import entities.User;

@Local
public interface BasicOpsServiceLocal {
	void saveOrUpdateUser(User user);

	void saveOrUpdateCourse(Course course);

	List<Course> findAllCourses();
}
