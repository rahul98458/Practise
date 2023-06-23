package com.Services;

import java.util.ArrayList;
import java.util.List;

import com.Model.Teacher;

public class TeacherServiceImple implements TeacherServices {
   static List<Teacher> teaclist = new ArrayList<>();
    @Override
    public void addTeacher(Teacher t) {
      teaclist.add(t);
      System.out.println("added successfully");
    }

    @Override
    public List<Teacher> displayTeacher() {
    return teaclist;
    }

    @Override
    public void deleteTeacher(int index) {
      List<Teacher> dellist = new ArrayList<>(teaclist);
      dellist.remove(index);
       System.out.println(dellist);
    }
    
}
