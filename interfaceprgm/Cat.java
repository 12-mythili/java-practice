package interfaceprgm;
import java.util.Scanner;
public class Cat implements animal {
    String catsound;
    public void setSound()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the cat sound :");
        catsound=scan.nextLine();
    }
    public void getSound()
    {
        System.out.println("the cat sound is :"+catsound);
    }
    
}
