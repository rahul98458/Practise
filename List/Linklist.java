package List;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Linklist {
    Scanner in = new Scanner(System.in);
      Address aobj=new Address("Nepal", "Bagmati", "Narayangarh");
      List<Teacher> tlist = new LinkedList<Teacher>(); 
       List<Student> slist = new LinkedList<Student>();
    public static void main(String[] args) {
        Linklist obj = new Linklist();
       // obj.addStudent();
        obj.addTeacher();
      // obj.displayStudent();
       obj.displayTeacher();
       obj.searchTeacher();
    }
     void addTeacher()
     {
        Teacher obj1 = new Teacher(1, "Ram", aobj);
        Teacher obj2 = new Teacher(2, "Rajesh", aobj);
        Teacher obj3 = new Teacher(3, "Rajesh", aobj);
        tlist.add(obj1);
        tlist.add(obj2);
        tlist.add(obj3);
     }
     void addStudent()
     {
        Student obj1 = new Student(1, "Shyam", aobj);
        Student obj2 = new Student(2, "Deepak", aobj);
        Student obj3 = new Student(3, "Himal", aobj);
        slist.add(obj1);
        slist.add(obj2);
        slist.add(obj3);
     }
     void displayTeacher()
     {
        for (Teacher teacher : tlist) {
            System.out.println(teacher);
        }
     }
     void displayStudent()
     {
        for (Student student : slist) {
            System.out.println(student);
        }
     }
     void searchTeacher()
     {
        System.out.println("enter teacher name");
        String input = in.next().toUpperCase(); 
        int x =0; 
       for (Teacher teacher : tlist) {
            int flag = teacher.getName().compareTo(input);
             if(flag==0)
        {
            System.out.println(teacher);
            flag = 0;
            x = x+1;
        }
        }
        if(x==0)
        {
         System.out.println("sorry data not found");
        }
     }
}
