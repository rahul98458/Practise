package com.Services;

import java.util.ArrayList;
import java.util.List;

import com.Model.Student;

public class StudentServiceImpl implements StudentServices{
  
    static List<Student> slist = new ArrayList<>();
    @Override
    public void addStudent(Student s) {
       slist.add(s);
       System.out.println("added successfully");
    }
    @Override
    public void deleteStudent(int index) {
       slist.remove(index);
    }

    @Override
    public List<Student> getStudent() {
       return slist;
    }

    
    
}
