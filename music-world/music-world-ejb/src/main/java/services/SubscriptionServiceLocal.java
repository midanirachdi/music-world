package services;

import javax.ejb.Local;

import entities.Course;
import entities.User;

@Local
public interface SubscriptionServiceLocal {
	void assignCourseToTeacher(Course course, User teacher);

	void bookForCourse(User student, Course course);
}
