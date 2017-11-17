package services;

import java.util.Date;
import java.util.List;

import javax.ejb.Local;

import entities.BookingDetail;
import entities.Course;
import entities.User;

@Local
public interface BasicOpsServiceLocal {
	void saveOrUpdateUser(User user);

	void saveOrUpdateCourse(Course course);

	List<Course> findAllCourses();

	BookingDetail findBookingDetailById(User user, Course course, Date date);
	User getUserByLogin(String login,String pw);
}
