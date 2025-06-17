import java.util.Scanner;
class oddoreven{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.print("enter a number:");
        num=scan.nextInt();
        if(num%2==0)
        {
            System.out.print("even");
        }
        else
        {
            System.out.print("odd");
        }
        scan.close();
    }
}
