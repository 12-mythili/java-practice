import java.util.Scanner;
class reverse
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num,rem,temp,rev=0;
        num=scan.nextInt();
        temp=num;
        while(num>0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.print(rev);
    }
}