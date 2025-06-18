import java.util.Scanner;
class pattern
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num,i,j;
        num=scan.nextInt();
        for(i=0;i<=num;i++)
        {
            for(j=0;j<=num;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}