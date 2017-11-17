package services;

import java.util.List;

import javax.ejb.Remote;

import entities.Course;
import entities.User;

@Remote
public interface BasicOpsServiceRemote {
	void saveOrUpdateUser(User user);

	User findUserById(int id);

	void saveOrUpdateCourse(Course course);

	List<Course> findAllCourses();

	List<Course> findAllCoursesByTeacher(User teacher);

	Course findCourseById(int id);
	User getUserByLogin(String login,String pw);

}
