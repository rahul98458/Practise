package Composition;

public class Test {
    public static void main(String[] args) {


    

        Address add = new Address("Nepal", "Bagmati", "Narayangarh");
        Teacher obj = new Teacher(1,"Ramesh",add);
        Address add1 = new Address("Nepal", "Koshi", "Pokhara");
        Teacher obj1 = new Teacher(2, "Shyam", add1);
        Address add2 = new Address("Nepal", "Bagmati", "Narayangarh");
        Teacher obj2 = new Teacher(3, "Dipak", add2);
         Address sadd = new Address("Nepal", "Bagmati", "Narayangarh");
        Student  sobj = new Student(1,"Ramesh",sadd);
        Address sadd1 = new Address("Nepal", "Koshi", "Pokhara");
        Student sobj1 = new Student(2, "Shyam", sadd1);
        Address sadd2 = new Address("Nepal", "Bagmati", "Narayangarh");
        Student sobj2 = new Student(3, "Dipak", sadd2);
         School scobj = new School(obj, sobj);
         School scobj1 = new School(obj1, sobj1);
         School scobj2 = new School(obj2, sobj2);
         System.out.println(scobj+" "+scobj1+" "+scobj2);
    }
}
