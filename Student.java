import java.util.Scanner;
public class Student
{
    String name;
    int regno;
    String dept;
    int mobile;
    public Student()
    {
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public void setregno(int regno)
    {
        this.regno=regno;
    }
    public void setdept(String dept)
    {
        this.dept=dept;
    }
    public void setmobile(int mobile)
    {
        this.mobile=mobile;
    }
    public String getname()
    {
        return name;
    }
    public int getregno()
    {
        return regno;
    }
    public String getdept()
    {
        return dept;
    }
    public long getmobile()
    {
        return mobile;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student s = new Student();

        System.out.println("Enter the below student details");
        System.out.print("Enter the student name: ");
        s.setname(scan.nextLine());
        System.out.print("Enter the student register no: ");
        s.setregno(scan.nextInt());
        scan.nextLine();
        System.out.print("Enter the student department: ");
        s.setdept(scan.nextLine());
        System.out.print("Enter the student mobile : ");
        s.setmobile(scan.nextInt());
        scan.nextLine();

        System.out.println("Student name: " + s.getname());
        System.out.println("Student register: " + s.getregno());
        System.out.println("Student department: " + s.getdept());
        System.out.println("Student mobile: " + s.getmobile());
    }
    
}



