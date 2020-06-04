//
package com.SpringHibernateDemo.DAO.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.SpringHibernateDemo.DAO.StudentDAO;
import com.SpringHibernateDemo.entity.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private SessionFactory session;

	/*
	 * @see
	 * com.SpringHibernateDemo.DAO.StudentDAO#add(com.SpringHibernateDemo.entity.
	 * Student)
	 */
	@Override
	public void add(Student student) {
		session.getCurrentSession().save(student);
	}

	/*
	 * @see
	 * com.SpringHibernateDemo.DAO.StudentDAO#edit(com.SpringHibernateDemo.entity.
	 * Student)
	 */
	@Override
	public void edit(Student student) {
		session.getCurrentSession().update(student);
	}

	/*
	 * @see com.SpringHibernateDemo.DAO.StudentDAO#delete(int)
	 */
	@Override
	public void delete(int studentId) {
		session.getCurrentSession().delete(getStudent(studentId));
	}

	/*
	 * @see com.SpringHibernateDemo.DAO.StudentDAO#getStudent(int)
	 */
	@Override
	public Student getStudent(int studentId) {
		return session.getCurrentSession().get(Student.class, studentId);
	}

	/*
	 * @see com.SpringHibernateDemo.DAO.StudentDAO#getAllStudent()
	 */
	@Override
	public List<Student> getAllStudent() {
		return session.getCurrentSession().createQuery("from student", Student.class).list();
	}

}
