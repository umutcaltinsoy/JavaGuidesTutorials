package com.deneme.studentmanagement.service;

import com.deneme.studentmanagement.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    // Save students
    Student saveStudent(Student student);

    // Update students
    Student getStudentById(Long id);
    Student updateStudent(Student student);

    // Delete students
    void deleteStudentById(Long id);
}
