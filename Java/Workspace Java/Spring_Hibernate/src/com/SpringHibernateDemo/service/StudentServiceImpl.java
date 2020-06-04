//
package com.SpringHibernateDemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.SpringHibernateDemo.DAO.StudentDAO;
import com.SpringHibernateDemo.entity.Student;


@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentDAO studentDAO;
	
	/* 
	* @see com.SpringHibernateDemo.service.StudentService#add(com.SpringHibernateDemo.entity.Student)
	*/
	@Transactional
	public void add(Student student) {
		studentDAO.add(student);
	}

	/* 
	* @see com.SpringHibernateDemo.service.StudentService#edit(com.SpringHibernateDemo.entity.Student)
	*/
	@Transactional
	public void edit(Student student) {
		studentDAO.edit(student);
	}

	/* 
	* @see com.SpringHibernateDemo.service.StudentService#delete(int)
	*/
	@Transactional
	public void delete(int studentId) {
		studentDAO.delete(studentId);
	}

	/* 
	* @see com.SpringHibernateDemo.service.StudentService#getStudent(int)
	*/
	@Transactional
	public Student getStudent(int studentId) {
		return studentDAO.getStudent(studentId);
	}

	/* 
	* @see com.SpringHibernateDemo.service.StudentService#getAllStudent()
	*/
	@Transactional
	public List<Student> getAllStudent() {
		return studentDAO.getAllStudent();
	}

}
