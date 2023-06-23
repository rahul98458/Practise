package com.View;

import java.util.List;
import java.util.Scanner;
import com.Model.Address;
import com.Model.Student;
import com.Model.Teacher;
import com.Services.StudentServiceImpl;
import com.Services.StudentServices;
import com.Services.TeacherServiceImple;
import com.Services.TeacherServices;
public class Test {
   static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        choose();
    }
    static void choose()
        {
               System.out.println("which yoy want to enter student or teacher[s/t]");
               char choose = in.next().charAt(0);
               if(choose=='s')
               {
                         sadd();
                         sdisplay();
                         sdelete();
               }
               else
               {
                        tadd();
                        tdisplay();
                        tdelete();
               }
        }
    
    static void sadd()
    {
       char flag = 'y';
       do
       {
        StudentServices ser = new StudentServiceImpl();
        System.out.println("enter student id");
        int id = in.nextInt();
        System.out.println("enter student name");
        String name = in.next();
        System.out.println("enter student state");
        String state = in.next();
        System.out.println("enter student city");
        String city = in.next();
        Address aobj = new Address(state, city);
        Student obj = new Student(id, name, aobj);
        ser.addStudent(obj);
        System.out.println("do you want to continue??[y/n]");
        flag =in.next().charAt(0);
    }
    while(flag=='y');
    }

      static void sdisplay()
      {
        StudentServices ser = new StudentServiceImpl();
       List<Student> dataStudent = ser.getStudent();
       System.out.println(dataStudent);
      }
      static void sdelete()
      {
         StudentServices ser = new StudentServiceImpl();
         System.out.println("enter the name");
         String name = in.next();
         List<Student> slist = ser.getStudent();;
         for (Student student : slist) {
          int flag = student.getName().compareTo(name);
          if(flag==0)
          {
            // System.out.println(slist.indexOf(student));
           ser.deleteStudent(slist.indexOf(student));
          }
         }
      }
    static void tadd()
    {
      char flag = 'y';
      do{
      TeacherServices tserv = new TeacherServiceImple();
      System.out.println("enter teacher id");
      int id = in.nextInt();
      System.out.println("enter teacher name");
      String name = in.next();
      System.out.println("enter teacher state");
      String state = in.next();
      System.out.println("enter teacher city");
      String city = in.next();
      Address add = new Address(state, city);
      Teacher tobj = new Teacher(id, name, add);
      tserv.addTeacher(tobj);
      System.out.println("do you want to add??[y/n]");
      flag=in.next().charAt(0);
      }
      while(flag=='y');
    }
    static void tdisplay()
    {
      TeacherServices tserv = new TeacherServiceImple();
     List<Teacher> teacherData = tserv.displayTeacher();
     System.out.println(teacherData);
    }
    static void tdelete()
    {
      TeacherServices tserv = new TeacherServiceImple();
     List<Teacher> tlist = tserv.displayTeacher();
     System.out.println("enter the name of teacher of which u want to delete");
     String name = in.next();
     for (Teacher teacher : tlist) {
      int flag = teacher.getName().compareTo(name);
      if(flag==0)
      {
        tserv.deleteTeacher(tlist.indexOf(teacher));
      }
     }
    }

}
