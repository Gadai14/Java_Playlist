// Write a program in Java to count the number of digits(Between 1 to 10 digit number ) of an integer taken from user. 

import java.util.Scanner;
class count
{
    int count=0;
    Scanner s=new Scanner(System.in);

    public void calculation()
    {
        int num;
        System.out.println("Enter a number(Between 1 to 10 digits) to count Digits :");
         num=s.nextInt();
          
            while (num!=0) {
                num = num / 10;
                  count++;
            }
       
        System.out.println("Number of digits: " + count);
    }
        }

//This class name should be same as the file name given by user
public class Count_digits {
    public static void main(String args[])
    {
        count obj=new count();
        obj.calculation();
    }
    
}