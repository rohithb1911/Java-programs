import java.util.Scanner;
class Salary
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int bas=sc.nextInt();
        float gross=0.0f;
        if(bas>0)
        {
            if(bas<=10000)
            {
                gross=bas+(bas*0.2f)+(bas*0.8f);
            }
            else if(bas>10000 && bas<20000)
            {
                gross=bas+(bas*0.25f)+(bas*0.9f);
            }
            else
            {
                gross=bas+(bas*0.3f)+(bas*0.95f);
            }
            System.out.printf("Rs.%.2f",gross);
        }
    }
}