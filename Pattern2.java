import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Rows : ");
        int n=sc.nextInt();
        System.out.println("---------------------------------------------");
        for(int i=n;i>=0;i--)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
          System.out.print("---------------------------------------------");
    }
}
