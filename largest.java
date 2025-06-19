import java.util.Scanner;
class largest
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n,max=0,smax=0,i;
        System.out.print("Enter the size:");
        n=scan.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]<max && arr[i]>smax)
            {
                smax=arr[i];
            }
        }
        System.out.println("first largest number is :"+max);
        System.out.println("second largest number is :"+smax);
    }
}