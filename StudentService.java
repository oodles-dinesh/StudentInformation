package com.example.studentinformation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentinformation.Entity.Student;
import com.example.studentinformation.StudentDao.StudentRepository;

@Service

public class StudentService  {
	
      @Autowired
	private StudentRepository studentRepository;
      
  	public List<Student> getStudent()
  	{
  		return studentRepository.findAll();
  	}
  	public Student getStudentId(long studentid)
  	{
  		return studentRepository.getById(studentid);
  	}
  	public Student addStudent(Student student) {
  		return studentRepository.save(student);
  	}
  	
  	public Student updateStudent(Student student,long studentid)
  	
  	{
  		return studentRepository.save(student);
  	}
  	public void deleteStudent(long studentid)
  	{
  		studentRepository.deleteById(studentid);
  	}
  	
  	

  }

	
