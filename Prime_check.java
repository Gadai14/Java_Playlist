
// Write a program in java to check whether a number is prime or not

import java.util.*;
class check_p
{
    int i,a;
    int s=1;
    Scanner sc=new Scanner(System.in);
    void input()
    // In this method stores the input given by the user
    {
        System.out.println("Enter a number to check prime r not :-----\t");
        a=sc.nextInt();
    }
    void check()
    {
        
        for(i=2;i<=Math.sqrt(a);i++)
        {
            if(a%i==0)
            {
                s=0;
                break;
            }
        }
      
    }
    void display()
    {
        if(s==1)
        System.out.println(a+"\tis a prime numeber");
        else
         System.out.println(a+"\tis not a prime numeber");
    }
}
public class Prime_check
// This class name should be same as the File name 
{
    public static void main(String args[])
    {
        check_p obj=new check_p();
        obj.input();
        obj.check();
        obj.display();
    }
}
