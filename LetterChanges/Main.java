import java.util.*; 
import java.io.*;

class Main {  
  public static String LetterChanges(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       
       
       String temp = "";
       
       for(int i = 0; i < str.length(); i++){
           
           char curr_char = str.charAt(i);
           char future_char;
           
           if(Character.isLetter(curr_char)){
                future_char = (char) (((int) str.charAt(i)) + 1);
                
                if(future_char == 'a' ||future_char == 'e' || future_char == 'i' || future_char == 'o' || future_char == 'u'){
                    future_char = Character.toUpperCase(future_char);
                }
                temp += future_char;
           }
           else{
               temp += curr_char;
           }
           
           
       }
       
       
       
       
    return temp;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterChanges(s.nextLine())); 
  }   
  
}
