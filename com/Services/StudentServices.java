package com.Services;

import java.util.List;

import com.Model.Student;

public interface StudentServices {
void addStudent(Student s);
void deleteStudent(int index);
List<Student> getStudent();
}
