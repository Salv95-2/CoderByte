import java.util.*; 
import java.io.*;

/*
Using the Java language, have the function TimeConvert(num) take the num 
parameter being passed and return the number of hours and minutes the parameter 
converts to (ie. if num = 63 then the output should be 1:3). Separate the number 
of hours and minutes with a colon. 
*/

class Main {  
  public static String TimeConvert(int num) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       
     
       if(num < 60){
           return ("0:" + Integer.toString(num));
       }
       
       int hours = 0;
       int minutes = num;
       
       while(minutes >= 60){
           hours += 1;
           minutes -= 60;
       }
       
       return (Integer.toString(hours) + ":" + Integer.toString(minutes));
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(TimeConvert(s.nextLine())); 
  }   
  
}
