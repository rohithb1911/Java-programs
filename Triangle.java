import java.util.Scanner;
class Triangle
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int s1=sc.nextInt();
       int s2=sc.nextInt();
       int s3=sc.nextInt();
       if((s1+s2>s3)&&(s1+s3>s2)&&(s2+s3>s1))
       {
        System.out.println("It form a triangle");
       }
       else
       {
        System.out.println("Invalid");
       }
    }
}