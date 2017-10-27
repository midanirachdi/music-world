package services;

import java.util.List;

import javax.ejb.Remote;

import entities.Course;
import entities.User;

@Remote
public interface BasicOpsServiceRemote {
	void saveOrUpdateUser(User user);

	void saveOrUpdateCourse(Course course);

	List<Course> findAllCourses();

}
