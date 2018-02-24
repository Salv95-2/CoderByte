import java.util.*; 
import java.io.*;

/*
Using the Java language, have the function LetterCapitalize(str) take the str 
parameter being passed and capitalize the first letter of each word. Words will be separated by only one space. 
*/

class Main {  
  public static String LetterCapitalize(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. 
    */
    
    String[] words = str.split("\\s+");
    
    String new_sentence = "";
    
    for(int i = 0; i < words.length; i++){
        
        String temp_word = words[i];
        String new_word = "";
        
        for(int j = 0; j < temp_word.length(); j++){
            
            if(j == 0){
                new_word += Character.toUpperCase(temp_word.charAt(j));
            }
            else{
                new_word += temp_word.charAt(j);
            }
        }
        if(i < words.length - 1){
            new_word += " ";
        }

        new_sentence += new_word;
    }
       
    return new_sentence;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterCapitalize(s.nextLine())); 
  }   
  
}








  
