package ClassProjects;

public class countQuarters {
    
    public static void main(String[] args) {

        System.out.println(countQuartersM("575")); // 3
        System.out.println(countQuartersM("1025")); // 1
        System.out.println(countQuartersM("5721")); // 0
        System.out.println(countQuartersM("0")); // 0
        System.out.println(countQuartersM("5")); // 0
        System.out.println(countQuartersM("10")); // 0



    }
    public static int countQuartersM(String cents) {

       int totalCents = 0;
       if (cents.length() < 2) {
       return 0;
       }
       totalCents = Integer.parseInt(cents.substring(cents.length()-2));
      return totalCents % 100 / 25;
}
  
}
