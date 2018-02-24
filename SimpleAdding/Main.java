import java.util.*; 
import java.io.*;

/*
Challenge
Using the Java language, have the function SimpleAdding(num) add up all the numbers 
from 1 to num. For example: if the input is 4 then your program should return 10 because 1 + 2 + 3 + 4 = 10. 
For the test cases, the parameter num will be any number from 1 to 1000. 
*/
class Main {  
  public static int SimpleAdding(int num) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       
       int total = 0;
       
       for(int i = num; i > 0; i--){
           
           total += i;
       }
       
    return total;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(SimpleAdding(s.nextLine())); 
  }   
  
}
