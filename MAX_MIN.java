import java.util.*;
class a{
int n;
Scanner sc=new Scanner(System.in);
public void input()
{
    System.out.println("Enter the length of the array :");
    n=sc.nextInt();
    int [] arr=new int[50];
    System.out.println("Enter elements :");
    for(int i=0;i<n;i++)
    {
arr[i]=sc.nextInt();

    }
     for(int i=0;i<n;i++)
    {
       
        System.out.println("Array of "+"["+i+"]"+"is :"+arr[i]);

    }

    int max=arr[0];
    int min=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            max=arr[i];
            else if(arr[i]<min)
            min=arr[i];

        
        }
        System.out.println("The maximum number is :"+max);
        System.out.println("The minimum number is :"+min);



}
}

public class Array2 {
    public static void main(String[] args) {
        a obj=new a();
        obj.input();
    }
}
