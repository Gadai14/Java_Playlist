// Write a Program In java to reverse a number 

import java.util.*;

;
 abstract class rev 
{
    int num, sum=0,r;
    Scanner sc= new Scanner(System.in);
      abstract void input();
      abstract void cal();
}
class A extends rev
   
  {

    public void input()
      {
        System.out.println("Enter the Number By user :");
        num=sc.nextInt();
      }
   
    void cal()
    {
        System.out.println("Number in the reversed Form :");
        for(int i=0;i<num;i++)
        {
            r=num%10;
            sum=sum*10 + r;
            num =num/10;
        }
        System.out.println(""+sum);
    }
    
}

public class Reverse
{
    public static void main(String args[])
    {
        A obj=new A();
        obj.input();
        obj.cal();

    }
}