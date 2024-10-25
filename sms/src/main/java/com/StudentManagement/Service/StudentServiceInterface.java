package com.StudentManagement.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.StudentManagement.Entity.Student;
@Service
public interface StudentServiceInterface {
	public List<Student> getAllStudents();
	public Student getStudentById(Long id);
	public Student addStudent(Student student);
	public Student updateStudent(Long id, Student student);
	public void deleteStudent(Long id);
}
