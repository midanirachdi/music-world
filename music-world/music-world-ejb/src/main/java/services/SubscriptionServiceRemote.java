package services;

import javax.ejb.Remote;

import entities.Course;
import entities.User;

@Remote
public interface SubscriptionServiceRemote {
	void assignCourseToTeacher(Course course, User teacher);

	void bookForCourse(User student, Course course);
}
