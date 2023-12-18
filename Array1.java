import java.util.*;
class a{
int n;
Scanner sc=new Scanner(System.in);
public void input()
{
    System.out.println("Enter the length of the array :");
    n=sc.nextInt();
    int [] arr=new int[n];
    System.out.println("Enter elements :");
    for(int i=0;i<n;i++)
    {
arr[i]=sc.nextInt();

    }
     for(int i=0;i<n;i++)
    {
       
        System.out.println("Array of "+"["+i+"]"+"is :"+arr[i]);

    }
}
}

public class Array1 {
    public static void main(String[] args) {
        a obj=new a();
        obj.input();
    }
}
