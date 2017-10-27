package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.Course;
import entities.User;

/**
 * Session Bean implementation class BasicOpsService
 */
@Stateless
public class BasicOpsService implements BasicOpsServiceRemote, BasicOpsServiceLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public BasicOpsService() {
	}

	@Override
	public void saveOrUpdateUser(User user) {
		entityManager.merge(user);
	}

	@Override
	public void saveOrUpdateCourse(Course course) {
		entityManager.merge(course);
	}

	@Override
	public List<Course> findAllCourses() {
		String jpql="SELECT z FROM Course z";
		Query query=entityManager.createQuery(jpql);
		return query.getResultList();
	}

}
