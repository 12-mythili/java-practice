public class Calc{
    int sum=0;
    int sub;
    int multiply=1;
    double division=1;

public void setsum(int a,int b)
{
    this.sum=a+b;
}
public void setsub(int a,int b)
{
    this.sub=a-b;
}
public void setmultiply(int a,int b)
{
    this.multiply=a*b;
}
public void setdivision(double a,double b)
{
    this.division=a/b;
}
public int getsum()
{
    return sum;
}
public int getsub()
{
    return sub;
}
public int getmultiply()
{
    return multiply;
}
public double getdivision()
{
    return division;
}
public static void main(String[] args)
{
    Calc a = new Calc();
    a.setsum(8,4);
    a.setsub(8,4);
    a.setmultiply(8,4);
    a.setmultiply(8,4);
    System.out.println("Addition :"+a.getsum());
    System.out.println("Subtraction :"+a.getsub());
    System.out.println("Multiplication :"+a.getmultiply());
    System.out.println("Division :"+a.getdivision());
    
}
}

