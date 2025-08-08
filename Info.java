class Info
{
    String firstName;
    String lastName;
    int pincode;
public Info(String firstName,String lastName,int pincode)
{
    this.firstName=firstName;
    this.lastName=lastName;
    this.pincode =pincode;
}
public boolean equals(Object person)
{
if(person instanceof Info)
{
    Info p=(Info) person;
    return this.pincode==p.pincode;
}
else
{
    return false;
}
}

public static void main(String[] args)
{
    Info p1=new Info("mythili","manoharan",1234);
    Info p2=new Info("mythili","manoharan",1235);
    System.out.println(p1.equals(p2));
}
}