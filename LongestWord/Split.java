import java.util.*; 
import java.io.*;
import java.util.Arrays;

/*
Using the Java language, have the function LongestWord(sen) take the sen parameter being passed and
return the largest word in the string. If there are two or more words that are the same length, return 
the first word from the string with that length. Ignore punctuation and assume sen will not be empty. 
*/

class Split {  
  public static String LongestWord(String sen) { 
  
   
   String arr[] = sen.split("[^a-zA-z0-9]");
   
   int longest_string_index = 0;
   
   for(int i = 1; i < arr.length; i++){
        if(arr[i].length() > arr[longest_string_index].length()){
            longest_string_index = i;
        }
   }
       
    return arr[longest_string_index];
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine())); 
  }   
  
}