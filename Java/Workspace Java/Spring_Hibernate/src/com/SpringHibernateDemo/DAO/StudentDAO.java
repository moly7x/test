//
package com.SpringHibernateDemo.DAO;

import java.util.List;

import com.SpringHibernateDemo.entity.Student;

/**
 * This class is . 
 * 
 * @author: Tân
 * @create_date: 02/06/2020
 */
public interface StudentDAO {
	public void add(Student student);
	public void edit (Student student);
	public void delete (int studentId);
	public Student getStudent(int studentId);
	public List<Student> getAllStudent();
}
