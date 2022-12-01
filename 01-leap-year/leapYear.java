package ClassProjects;
import java.util.Scanner;

public class leapYear {

    public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("Enter a year: ");
int leapYearInput = s.nextInt();
if (leapYearInput % 4 == 0) {
    if (leapYearInput % 100 == 0) {
        if (leapYearInput % 400 == 0) {
            isLeapYear();
        } else {
            notLeapYear();
        }
    } else {
        isLeapYear();
    }
} else {
    notLeapYear();
}

s.close();

    }
    public static void notLeapYear() {
System.out.println("It is not a leap year.");
    }
    public static void isLeapYear() {
System.out.println("It is a leap year.");
    }
}
