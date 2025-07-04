package Studentdetails;
import java.util.ArrayList;
import java.util.Scanner;
public class Input {
    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        int choice=1;
        do{
            System.out.println("enter the student name:");
            String name=scan.nextLine();
            System.out.println("enter the student dept:");
            String dept=scan.nextLine();
            System.out.println("Enter the studying stay details(hostel/dayscholar)");
            String stay=scan.nextLine();
            Student student=new Student(name,dept,stay);
            students.add(student);
            System.out.println("press 1 or 0.1 for adding student details and 0 for exit");
            choice=scan.nextInt();
            scan.nextLine();

        }while(choice==1);
        int option;
        do {
            System.out.println("1.add students");
            System.out.println("2.print dept");
            System.out.println("3.print stay");
            System.out.println("4.Exit");
            option = scan.nextInt();
            scan.nextLine();
            if(option==1)
            {
                for(Student s:students)
                {
                    if(s.getName().toLowerCase().endsWith("i"))
                    {
                        System.out.println(s.getName());
                    }
                }
            }
            else if(option==2)
            {
                for(Student s:students)
                {
                    if(s.getDept().equals("IT"))
                    {
                        System.out.println(s.getName());
                    }
                }
            }
            else if(option==3)
            {
                for(Student s:students)
                {
                    if(s.getStay().equals("Hostel"))
                    {
                        System.out.println(s.getName());
                    }
                }
            }
            else {
                System.out.println("exit");
            }
        }while(option<4);
    }
}
