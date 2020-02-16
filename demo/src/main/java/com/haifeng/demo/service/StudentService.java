package com.haifeng.demo.service;

import com.haifeng.demo.entity.Student;
import com.haifeng.demo.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class StudentService {

  @Autowired
  StudentRepository studentRepository;

  public List<Student> getStudents() {

    log.error("error level: Get all students");
    log.warn("warn level: Get all students");
    log.info("info level: Get all students");
    log.debug("debug level: Get all students");
    return studentRepository.findAll();
  }

  public List<Student> getExampleStudents() {
    List<Student> students = new ArrayList<>();
//    students.add(new Student("Peter", 28));
//    students.add(new Student("Jason", 34));
    return students;
  }
}
