import java.util.Scanner;
class Magic_no
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int dig,sum=0;
        while(num>9)
        {
            sum=0;
            while(num!=0)
            {
                dig=num%10;
                sum=sum+dig;
                num=num/10;
            }
            num=sum;
        }
        if(sum==1)
        {
            System.out.print("Magic number");
        }
        else
        {
            System.out.print("not");
        }
    }
}