import java.util.Scanner;
class day
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int tot_days=sc.nextInt();
        int y=tot_days/365;
        int a=tot_days%365;
        int w=a/7;
        int d=a%7;
        System.out.println("Number of Years:"+y);
        System.out.println("Number of Weeks:"+w);
        System.out.println("Number of Days:"+d);
    }
}