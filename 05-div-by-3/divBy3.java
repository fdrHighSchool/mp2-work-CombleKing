package ClassProjects;

public class divBy3 {

    public static void main(String[] args) {
        
        System.out.println(div3bool(3411));   // 3 + 4 + 1 + 1 = 9,         9 is divisible by 3          True       
        System.out.println(div3bool(71));     // 7 + 1 = 8,                 8 is not divisible by 3      False
        System.out.println(div3bool(26789));  // 2 + 6 + 7 + 8 + 9 = 32,    32 is not divisible by 3     False
    }


    public static boolean div3bool(int num) {
String numString = Integer.toString(num);
int sum = 0;
        for (int i = 0; i < numString.length(); i++) {
            sum += Integer.parseInt(numString.substring(i, i+1));
        }
       return sum % 3 == 0;
    }

    
}
