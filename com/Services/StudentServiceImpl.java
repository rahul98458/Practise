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
      List<Student> list = new ArrayList<>(slist);
      list.remove(index);
      System.out.println(list);
    }

    @Override
    public List<Student> getStudent() {
       return slist;
    }

    
    
}
