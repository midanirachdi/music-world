package services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Course;
import entities.User;

/**
 * Session Bean implementation class SuscriptionService
 */
@Stateless
public class SubscriptionService implements SubscriptionServiceRemote, SubscriptionServiceLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public SubscriptionService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void assignCourseToTeacher(Course course, User teacher) {
		// TODO Auto-generated method stub

	}

	@Override
	public void bookForCourse(User student, Course course) {
		// TODO Auto-generated method stub

	}

}
