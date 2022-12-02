public class str {
    public static void main(String[]args){
        String str1 = "roller";
        String str2 = "hihi";
        String str3 = "HelloThere";
        System.out.println(concat(str1, str2));
        System.out.println(firsthalf(str3));
        System.out.println(rep(str2, 3));
        System.out.println(hiapp(str2));
        System.out.println(makeSar(str3));
        System.out.println(sumDi(str3));
    }
    public static int sumDi(String str) {
        int sum = 0;
        char digitsArr[] = new char[10];
        digitsArr[0] = '0';
        digitsArr[1] = '1';
        digitsArr[2] = '2';
        digitsArr[3] = '3';
        digitsArr[4] = '4';
        digitsArr[5] = '5';
        digitsArr[6] = '6';
        digitsArr[7] = '7';
        digitsArr[8] = '8';
        digitsArr[9] = '9';
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < digitsArr.length; j++) {
                if (str.charAt(i) == digitsArr[j]) {
                    sum += Integer.parseInt(str.substring(i, i+1));
                }
            }
        }
        return sum;
    }

    public static String firsthalf(String x){
        return x.substring(0, x.length()/2);
    }
    public static String concat(String x, String y){
        String add =x+y;
        if(x.equals("")||y.equals("")){
            return add;
        }else{
            if(x.charAt(x.length()-1)==y.charAt(0)){
                add = x.substring(0,x.length()-1)+y;
                return add;
            }else{
                return add;
            }
        }
    }
    public static int hiapp(String x){
        int trep = 0;
        for(int i=0; i<=x.length()-2;i++){
            if(x.substring(i, i+2).equals("hi")){
                trep++;
            }
        }
        return trep;
    }
    public static String rep(String x, int y){
        String fin= "";
            x = x.substring(x.length()-y);
            for(int i = 0; i<y; i++){
                fin+=x;
            }
        return fin;
    }
    public static String makeSar(String str) {
        String sarFinal = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                sarFinal += String.valueOf(str.charAt(i)).toLowerCase();
            } else {
                sarFinal += String.valueOf(str.charAt(i)).toUpperCase();
            }
        }
        return sarFinal;
    }
}