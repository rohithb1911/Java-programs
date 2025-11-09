import java.util.Scanner;
class Neon_no
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int dig,sum=0;
        int num1=num*num;
        while(num1!=0)
        {
            dig=num1%10;
            sum=sum+dig;
            num1=num1/10;
        }
        if(sum==num)
        {
            System.out.println("neon number");
        }
        else
        {
            System.out.print("Not");
        }
    }
}