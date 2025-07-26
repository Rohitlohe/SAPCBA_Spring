package com.sapcba.sapcbaapp.studentservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapcba.sapcbaapp.student.Student;
import com.sapcba.sapcbaapp.studentdto.StudentDTO;
import com.sapcba.sapcbaapp.studentrepo.StudentRepo;

@Service
public class StudentService {

//  private final Map<Long, Product> productRepo = new HashMap<>();
	@Autowired
	private StudentRepo studentRepo;

	public List<Student> getAllStudent() {

		return studentRepo.findAll();
	}

	public Student getStudentById(Long id) {
		Student addedStudent = studentRepo.findStudentById(id);
		return addedStudent;

	}

	public String deleteStudent(Long id) {
		studentRepo.deleteById(id);
		return ("delted successfully");
	}

	public Student saveStudent(StudentDTO studentdto) {
		// TODO Auto-generated method stub
		Student savedStudent = createStudent(studentdto);
		return studentRepo.save(savedStudent);
	}

	public Student updateStudent(Long id, StudentDTO updatedStudentdto) {
//		// TODO Auto-generated method stub
		Student existingStudent = getStudentById(id);
		Student updatedStudent = createStudent(existingStudent, updatedStudentdto);
		return studentRepo.save(updatedStudent);
	}

	public Student createStudent(StudentDTO dto) {
		Student student = new Student();
		student.setName(dto.getName());
		student.setLastName(dto.getLastName());
		student.setContact(dto.getContact());
		student.setEmail(dto.getEmail());
		System.out.println("created"+dto.toString());
		return studentRepo.save(student);
	}

	public Student createStudent(Student student, StudentDTO dto) {
		student.setName(dto.getName());
		student.setLastName(dto.getLastName());
		student.setContact(dto.getContact());
		student.setEmail(dto.getEmail());
		System.out.println("updated"+dto.toString());
		return studentRepo.save(student);
	}

}
