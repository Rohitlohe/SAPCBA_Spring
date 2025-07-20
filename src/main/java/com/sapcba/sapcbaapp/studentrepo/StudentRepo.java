package com.sapcba.sapcbaapp.studentrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sapcba.sapcbaapp.student.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

	public Student findStudentById(Long id);
}
