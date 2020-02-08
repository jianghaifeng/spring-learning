package com.haifeng.demo.repository;

import com.haifeng.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
