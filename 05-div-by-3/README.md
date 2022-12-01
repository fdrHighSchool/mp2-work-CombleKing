# Div By 3
#### Respond to the following:

1. A number is considered *prime* if its only factors are 1 and itself. For example, 7 is prime (1 and 7 are the only factors) and 9 is not (1, 3 and 9 are factors).  
Outline an algorithm to determine whether or not a number is prime.  
Think of the following method header:
`public static boolean isPrime(int num)`

  * 1) check if the numbers are divisible by numbers 2 and higher. 
    2) write a for loop with i beginning with 2 and it increases by 1 everytime it runs. 
    3) in the for loop divide the given number by i and if num/i == 0 it is not a prime number and break the code.
    4) if the loop continues then return it is a prime number.
