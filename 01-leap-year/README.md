# Leap Year
#### Respond to the following:

1. Rewrite the following nested `if()` statements in a single line:
  ```
  if (year % 4 == 0) {
      if (year % 100 != 0) {
        // DO STUFF
      } // end inner if statement
   } // end outer if statement
  ```
  *
  ```
  if(year%4==0 || year %100 == 0){
  //Do Things
  }//end if statement
  ```


2. Label each as either correct or incorrect syntax. If incorrect, rewrite below:
  * if (x == y) {

    * Correct

  * if [x == 10] {

    * Incorrect, relace brackets with paranthesis, if (x ==10) {

  * if x = 10{

    * Incorrect, add paranthesis closing x = 10, and add an equal sign before 10, if (x==10){

  * if (x equals 42) {

    * incorrect, replace word equals with 2 equal signs, if (x==42){

  * if (x => y) {

    * incorrect, swap the place of the equals sign and greater than sign, if (x>=y){


3. Fix the error in the code below:

  ```
  Scanner console = new Scanner(System.in);
  System.out.print("What is your favorite color? ");
  String name = console.next();
  if (name == "blue") {
      System.out.println("Mine, too!");
  }
  ```

  *
  ```
  Scanner console = new Scanner(System.in);
  System.out.print("What is your favorite color? ");
  String name = console.nextline();
  if (name.equals"blue") {
  System.out.println("Mine, too!");
  }
  ```
