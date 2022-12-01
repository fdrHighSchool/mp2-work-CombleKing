package ClassProjects;
import java.util.Scanner;
public class fizzBuzz {
    public static void main(String []args ) {

        Scanner s = new Scanner(System.in);
System.out.println("Enter a number:");
        double num = s.nextDouble();

// LOOPING PURPOSES
        // for (int i = 1; i < 500; i++) {
        //     System.out.println(i + ": " + fizzyBuzzy(i));
        // }
        
// USER INPUT PURPOSES
        System.out.println(fizzyBuzzy(num));


        s.close();
        }


        
        public static String fizzyBuzzy(double num) {
String result = "";
            if (num % 3 == 0) {

                if(num % 5 == 0) {
                    return "FizzBuzz";
                } else {
                    return ("Fizz");
                }
    
            } else if (num % 5 == 0 ) {
                return ("Buzz");
            } else {
                result += num;
              return result;
            }
        }
    }
    
