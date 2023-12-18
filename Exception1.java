
public class Exception1 {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        int nums[]=new int[5];
        try{
            //First execute this statement whenever it throws exception goto the catch section without seeing next exception
            j=18/i;
            System.out.println("The result is : " +j);
            System.out.println("Printed element is :" + nums[1]);
            System.out.println(nums[5]);

        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Please stay in your limit !!! \n " + e);
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong !!!!! \n " +e);
        }
       

    }
}