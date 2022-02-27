package com.example.studentinformation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentinformation.Entity.Student;
import com.example.studentinformation.Service.StudentService;
@RestController

public class MainController {
	@Autowired
private StudentService studentservice;
	@GetMapping("/student")
	public List<Student> getStudent()
	{
		return studentservice.getStudent();
	}
	@GetMapping("/student/{id}")
	  public Student getStudentId(@PathVariable("id") long studentid)
	  {
		  return studentservice.getStudentId(studentid);
	  }
	  @PostMapping("/student")
	  public Student addStudent(@RequestBody Student student)
	  {
		  return studentservice.addStudent(student);
	  }
	  @PutMapping("/student/{id}")
	  public Student updateStudent(@RequestBody Student student,@PathVariable("id") long studentid)
	  {
		  studentservice.updateStudent(student,studentid);
		  return student;
		  
	  }
	  @DeleteMapping("/student/{id}")
	  public void deleteStudent(@PathVariable("id") long studentid)
	 {
		 studentservice.deleteStudent(studentid);
		 
	  }
	  
}
