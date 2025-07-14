package interfaceprgm;
import java.util.Scanner;

public class Dog implements animal{
    String dogsound;
    public void setSound(){
    Scanner scan= new Scanner(System.in);
    System.out.println("enter the dog sound");
    dogsound=scan.nextLine();
    
}
public void getSound()
{
    System.out.println("the dog sound is : "+dogsound);
}
}