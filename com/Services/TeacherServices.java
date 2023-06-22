package com.Services;

import java.util.List;

import com.Model.Teacher;

public interface TeacherServices {
    void addTeacher(Teacher t);
    List<Teacher> displayTeacher();
    void deleteTeacher(int index);
}
