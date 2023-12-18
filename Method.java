class abhi {
    public void multiply(int a,int b)
    {
        int result=a*b;
        System.out.println("The Multiplication is :"+result);
    }
    public int sum(int c,int d)
    {
        return c+d; 
    }
    public int divide(int x,int y)
    {
        return x/y;
    }
}
// This Class name should be same with the file name given by the user 
public class Method {
public static void main(String[] args)
 {
    // Here we create a object for the particular class

    abhi obj=new abhi();
    obj.multiply(12, 5);

    // Here we are calling the sum() method and passing the arguments of 2 numbers for addition 
    int add=obj.sum(70, 3);
    System.out.println("The addition of the two number is :" +add);
    int div=obj.divide(10, 5);
    System.out.println("The division is : "+div);
}
    
}