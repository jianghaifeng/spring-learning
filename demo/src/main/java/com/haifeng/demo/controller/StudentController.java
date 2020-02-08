package com.haifeng.demo.controller;

import com.haifeng.demo.entity.Student;
import com.haifeng.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

  @Autowired
  StudentService studentService;

  @GetMapping("/students")
  List<Student> getStudents() {
    return studentService.getStudents();
  }
}
