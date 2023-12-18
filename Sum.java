
//Write a java program to accept number from the user and print the sum .
import java.util.*;
class s
{
    int num1,num2,sum;
    Scanner s=new Scanner(System.in);
    void getdata()
    //This class is used to store the number given by user 
    {
        System.out.println("Enter the first number to calculate :");
        num1=s.nextInt();
        System.out.println("Enter the Second number to calculate :");
        num2=s.nextInt();
        
    }

    void addition()
    // This class is used to calculate the addition
    {
        sum=num1+num2;
        System.out.println("Addition of "+num1+ "+"+num2+ " is :\t"+sum);
    }


}

public class Sum
//This class name should be same as the file name
{
    public static void main(String args[])
    {
        s obj =new s();
        obj.getdata();
        obj.addition();
    }
}