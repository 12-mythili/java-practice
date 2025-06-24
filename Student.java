import java.util.Scanner;
public class Student{
    String name;
    int roll_no;
    String dept;
    int mobile_no;
    public Student(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name=scanner.nextLine();
        System.out.print("Enter roll_no: ");
        this.roll_no=scanner.nextInt();
        System.out.print("Enter dept: ");
        this.dept=scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter mobile_no: ");
        this.mobile_no=scanner.nextInt();
 }

    public static void main(String[] args){
    Student student= new Student();
}

}


