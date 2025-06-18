import java.util.Scanner;
class numbertoalphabet
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int num;
        num=scan.nextInt();
        if(num>=1 && num<=26)
        {
        char ch=(char)(96+num);
        System.out.print(ch);
        }
        else
        {
            System.out.print("limit exceeds");
        }
        
    }
}
