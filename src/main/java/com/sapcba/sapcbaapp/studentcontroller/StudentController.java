package com.sapcba.sapcbaapp.studentcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapcba.sapcbaapp.student.Student;
import com.sapcba.sapcbaapp.studentdto.StudentDTO;
import com.sapcba.sapcbaapp.studentservice.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	@GetMapping
	public List<Student> getAll() {
		return studentService.getAllStudent();

	}

	@PostMapping
	public Student saveStudent(StudentDTO studentdto) {
		return studentService.saveStudent(studentdto);
	}

	@PutMapping("/{id}")
	public Student updateStudent(@PathVariable Long id, @RequestBody StudentDTO updatedStudentdto) {
		return studentService.updateStudent(id, updatedStudentdto);
	}

	@GetMapping("/{id}")
	public Student getById(@PathVariable Long id) {
		return studentService.getStudentById(id);
	}

	@DeleteMapping("/{id}")
	public String delete(@PathVariable Long id) {
		return studentService.deleteStudent(id);
	}
}