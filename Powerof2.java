import java.util.Scanner;
class Powerof2
{
    static boolean isPowerOf2(int n)
    {
        while(n%2==0&&n>0)
        {
            n=n/2;
        }
        return (n==1);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean res=isPowerOf2(num);
        if(res==true)
          System.out.println("Power of 2");
        else
          System.out.println("not");
    }
}