public class Exception0 {
    public static void main(String[] args) {
        //  Arithmetic Exception
        try{
            int a=30,b=0;
            int c=a/b;
            System.out.println(c);
        }
        catch(Exception e)
        {
           System.out.println(e);
           System.out.println(" Can't divide by zero ");
        }

    }
}
