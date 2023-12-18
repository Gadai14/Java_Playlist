// Method Overloading means multiple methods with the same name but different parameter

class calculator {
    public int add(int n)
    {
        return n;
    }

    public int add(int n1,int n2)
    {
        return n1+n2;
    }

    public float add(float n1,float n2,float n3)
    {
        return n1+n2+n3;
    }
}
// This class name should be same with the file name given by user
public class Method_overloading {
    public static void main(String[] args) {
        calculator obj=new calculator();
        int r=obj.add(20);
        System.out.println("The single number value is : "+r);
        int r1=obj.add(8,4);
        System.out.println("The addition of two integer number is :" +r1);
        float r2=obj.add(3.8f,3.2f,2.0f);
        System.out.println("The addition of 3 float number is : "+r2);


    }
}