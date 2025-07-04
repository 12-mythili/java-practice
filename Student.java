package Studentdetails;

public class Student {
    String name;
    String dept;
    String stay;
    public Student(String name,String dept,String stay)
    {
        this.name=name;
        this.dept=dept;
        this.stay=stay;
    }
    public String getName()
    {
        return name;
    }
    public String getDept()
    {
        return dept;
    }
    public String getStay()
    {
        return stay;
    }
}
