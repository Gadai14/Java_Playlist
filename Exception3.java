import java.util.Scanner;
class TooHot extends Exception0 {
    TooHot(String message) {
        super(message);
    }
}

class TooCold extends Exception0 {
    TooCold(String message) {
        super(message);
    }
}

public class Exception3{
    public static void main(String[] args) {
        
        
        try(Scanner sc = new Scanner(System.in))
         {
            System.out.println("Enter temparature :");
            Float tem = sc.nextFloat();
            final float TOO_HOT_THRESHOLD = 35.05f;
            final float TOO_COLD_THRESHOLD = 5.0f;

            if (tem >= TOO_HOT_THRESHOLD) {
                throw new TooHot("Temperature is too hot!");
            } else if (tem < TOO_COLD_THRESHOLD) {
                throw new TooCold("Temperature is too cold!");
            } else {
                System.out.println("Normal");

                // Convert temperature to Fahrenheit
                Float fahrenheit = tem * (9f / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
            }

        } 
        
        catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid numeric value.");
        }catch (TooHot | TooCold e) {
            System.out.println(e.getMessage());
        }
    }
}
