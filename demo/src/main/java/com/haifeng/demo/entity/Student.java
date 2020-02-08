package com.haifeng.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "student")
@NoArgsConstructor
@AllArgsConstructor
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  @NotNull
  String name;

  @NotNull
  int age;
}
