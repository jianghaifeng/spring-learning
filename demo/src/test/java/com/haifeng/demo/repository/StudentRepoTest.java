package com.haifeng.demo.repository;

import com.haifeng.demo.entity.Student;
import io.zonky.test.db.AutoConfigureEmbeddedDatabase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@AutoConfigureEmbeddedDatabase
@SpringBootTest
public class StudentRepoTest {

  @Autowired
  StudentRepository repository;

  @Test
  void shouldGetEmptyStudentList() {
    List<Student> students = repository.findAll();
     System.out.println(students);
  }
}
