public class Student {
    String name;
    Student(String name)
    {
        this.name=name;
    }
public static void main(String[] args) {
    Student s1=new Student("A");
    Student s2=new Student("A");
    Student s3=new Student("A");
    Student S4=new Student("A");
    Student s5=new Student("A");
    Student s6=new Student("A");
    Student s7=new Student("A");
    Student s8=new Student("A");
    Student s9=new Student("A");
    Student s10=new Student("B");
    s1=s9;
    s2=s10;
    System.out.println(s1.equals(s9));


}
}
