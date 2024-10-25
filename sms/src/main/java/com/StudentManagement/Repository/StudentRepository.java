package com.StudentManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentManagement.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
