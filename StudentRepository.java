package com.example.studentinformation.StudentDao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.studentinformation.Entity.Student;

@Repository
@EnableJpaRepositories
public interface StudentRepository  extends JpaRepository<Student, Long>
{
public List<Student> getStudent();
public Student getStudentId(long studentid);
public Student addStudent(Student student);
public Student updateStudent(Student student,long studentid);
public void deleteStudent(long studentid);



}
