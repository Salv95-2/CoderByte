import java.util.*; 
import java.io.*;

/*
Using the Java language, have the function CheckNums(num1,num2) take both parameters being 
passed and return the string true if num2 is greater than num1, otherwise return the string false.
If the parameter values are equal to each other then return the string -1. 
*/
class Main {  
  public static String CheckNums(int num1, int num2) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       
       if(num1 == num2){
           return "-1";
       }
       
       if(num2 > num1){
           return "true";
       }
      
    return "false";
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(CheckNums(s.nextLine())); 
  }   
  
}
