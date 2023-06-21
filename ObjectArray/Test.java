package ObjectArray;

import java.util.Scanner;

public class Test {
    Employee[] emp = new Employee[2];
    Scanner input = new Scanner(System.in);
public static void main(String[] args) {
    Test tobj = new Test();
    tobj.empDetail();
    tobj.companyDisplay();
    tobj.empDisplay();
    tobj.searchByCity();
}
void empDetail()
{
   for (int i = 0; i < emp.length; i++) {
    System.out.println("enter employee id");
    int id = input.nextInt();
    System.out.println("enter employee name");
    String name = input.next().toUpperCase();
    System.out.println("enter employee state");
    String state = input.next().toUpperCase();
    System.out.println("enter employee city");
    String city = input.next().toUpperCase();
    Address addobj = new Address(state, city);
    Employee eobj = new Employee(id, name, addobj);
    emp[i]=eobj;
   }
}
void empDisplay()
{
    for (Employee empdata : emp) {
        System.out.println(empdata);
    }
}
 void companyDisplay()
{
    System.out.println("company name is "+Company.getName());
     System.out.println("company state is "+Company.getState());
      System.out.println("company city is "+Company.getCity());
}
void searchByCity()
{
    System.out.println("enter city name you want to search");
    String cname = input.next();
    String searchname=cname.toUpperCase();
    for (Employee empdata : emp) {
        int flag=0;
        flag = empdata.getAdd().getCity().compareTo(searchname);
        if(flag==0)
        {
            System.out.println(empdata);
            flag = 0;
        }
        else
        {
            System.out.println("sorry employee of "+searchname +"not found");
            return;
        }
       
    }
}
}
