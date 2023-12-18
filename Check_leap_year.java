
// Write a program in java to check whether a year is Leap year or not

import java.util.*;
abstract class leap_year
{
    int year;
    Scanner sc= new Scanner(System.in);
    abstract void input();
    abstract void check_leap();
}
class check extends leap_year
{
void input()
{
    System.out.println("Enter the year to check the year is leap year or not :--- ");
    year=sc.nextInt();
}
void check_leap()
{
    if(((year%4==0)&&(year%100!=0))||(year%400==0))
    {
        System.out.println(year+"\t is a Leap Year");
    }
    else
    System.out.println(year+"\t is not a Leap Year");
}
}
public class Check_leap_year
// This class name should be same as the file name 
{
    public static void main(String args[])
    {
        check obj=new check();
        obj.input();
        obj.check_leap();
    }
}
