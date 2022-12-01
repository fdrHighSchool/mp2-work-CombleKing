package ClassProjects;


public class letterGrade {
    
    public static void main(String[] args) {
        System.out.println(letter(105)+signString(105));
        System.out.println(letter(97)+signString(97));
        System.out.println(letter(95)+signString(95));
        System.out.println(letter(91)+signString(91));
        System.out.println(letter(89)+signString(89));
        System.out.println(letter(85)+signString(85));
        System.out.println(letter(81)+signString(81));
        System.out.println(letter(79)+signString(79));
        System.out.println(letter(75)+signString(75));
        System.out.println(letter(71)+signString(71));
        System.out.println(letter(69)+signString(69));
        System.out.println(letter(65)+signString(65));
        System.out.println(letter(62)+signString(62));
        System.out.println(letter(59)+signString(59));
        System.out.println(letter(40)+signString(40));

System.out.println("\n\n"); // SPLIT TEST CASES
        System.out.println(letter(105)+signInt(105));

        System.out.println(letter(97)+signInt(97));
        System.out.println(letter(95)+signInt(95));
        System.out.println(letter(91)+signInt(91));
        System.out.println(letter(89)+signInt(89));
        System.out.println(letter(85)+signInt(85));
        System.out.println(letter(81)+signInt(81));
        System.out.println(letter(79)+signInt(79));
        System.out.println(letter(75)+signInt(75));
        System.out.println(letter(71)+signInt(71));
        System.out.println(letter(69)+signInt(69));
        System.out.println(letter(65)+signInt(65));
        System.out.println(letter(62)+signInt(62));
        System.out.println(letter(59)+signInt(59));
        System.out.println(letter(40)+signInt(40));
       
        



    }
// I presented two possible solutions to tackling this problem
public static String signString(int grade) {
    String plusSign = "+";
    String minusSign = "-";
    String gradeString = Integer.toString(grade);
    if (grade < 60) {
        return "";
    } else {
        if (grade < 97) {
            if ( (gradeString.charAt(gradeString.length()-1) == '9') || (gradeString.charAt(gradeString.length()-1) == '8') || (gradeString.charAt(gradeString.length()-1) == '7')) {
                return plusSign;
        } else if ( (gradeString.charAt(gradeString.length()-1) == '0') || (gradeString.charAt(gradeString.length()-1) == '1') || (gradeString.charAt(gradeString.length()-1) == '2')) {
                return minusSign;
        } else {
            return "";
        }
     } else {
            return plusSign;
        }
    }
    }

public static String signInt(int grade) {
 String plusminus = "";
    int lastDigit = grade % 10;
    if (grade >= 97) {
        plusminus += "+";
    } else if (grade < 60) {
        return plusminus;
    } else if (lastDigit >= 0 && lastDigit <= 2) {
        plusminus += "-";
    } else if (lastDigit >= 7 && lastDigit <= 9) {
        plusminus += "+";
    } else {
        return plusminus;
    }
return plusminus;
}
public static String letter(int grade) {
    String letter = "";
    if (grade >= 90 && grade <= 2147483647) {
        letter += 'A';
    } else if (grade >= 80 && grade <= 89) {
        letter += 'B';
    } else if (grade >= 70 && grade <= 79) {
        letter += 'C';
    } else if (grade >= 60 && grade <= 69) {
        letter += 'D';
    } else {
        letter += 'F';
    }
    return letter;
}}

