
// Write a program in java to accept the name of the user and then print welcome message .

import java.util.Scanner;
class name
{
      String fname,lname;
      Scanner s=new Scanner(System.in);
void getdata()
{
    //Here we Store the name by user
System.out.println("Enter Your First Name :");
fname=s.next();
System.out.println("Enter Your Last Name :");
lname=s.next();
}
    void display()
    {
        //Here displays the Greetings message 
System.out.println("Good Morning  \t"+fname+" "+ lname+ " \t Have a Nice Day!");
    }

}
public class Display_msg
//This class name should be same as the File name
{
    public static void main(String args[])
{
    name obj=new name();
    obj.getdata();
    obj.display();
}
}