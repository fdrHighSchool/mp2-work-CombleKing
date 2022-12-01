# Letter Grade
#### Respond to the following:

1. Write a plan for the following extension:
  * Attach a "+" on their grade if the grade ends in a 7, 8 or 9 (eg: 78 -> C+, 89 -> B+)
  * Attach a "-" on their grade if the grade ends in a 0, 1 or 2 (eg: 92 -> A-, 61 -> D-)

    * 
    ```
        public static String pm(int grade){
    String sgrade ="" + grade;
    String plusminus="";
    sgrade = sgrade.substring(sgrade.length()-1);
    int ngrade =  Integer.parseInt(sgrade);
    if (ngrade >= 7){
        plusminus+="+";
        return plusminus;
        }
    else if (ngrade<=2){
        plusminus+="-";
        return plusminus;
        }
    else{
        return plusminus;
        }
    }
    ```

2. Discuss how you would make sure 100 is not misrepresented as an A-.
  * write an if statement saying if the grade is 100 or greater return A+.


3. Discuss how you would make sure grades that are an F are not mislabeled as F- or F+ (eg: 49 -> F+ and 52 -> F-)
  * dont use the sign function if their grade is below a certain number, just return a grade.
