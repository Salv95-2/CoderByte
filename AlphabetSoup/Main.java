import java.util.*; 
import java.io.*;

/*
Using the Java language, have the function AlphabetSoup(str) take the str string parameter 
being passed and return the string with the letters in alphabetical order (ie. hello becomes ehllo).
Assume numbers and punctuation symbols will not be included in the string. 
*/
class Main {  
  public static String AlphabetSoup(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       
       ArrayList<Character> list = new ArrayList<Character>();
       
       for(int i = 0; i < str.length(); i++){
           
           list.add(str.charAt(i));
       }
       
       Collections.sort(list);
       
       String new_str = "";
       
       for(int i = 0; i < list.size(); i++){
           new_str += list.get(i);
       }
       
    return new_str;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(AlphabetSoup(s.nextLine())); 
  }   
  
}
