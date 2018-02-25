import java.util.*; 
import java.io.*;

/*
Using the Java language, have the function KaprekarsConstant(num) 
take the num parameter being passed which will be a 4-digit number with
at least two distinct digits. Your program should perform the following 
routine on the number: Arrange the digits in descending order and in ascending 
order (adding zeroes to fit it to a 4-digit number), and subtract the smaller 
number from the bigger number. Then repeat the previous step. Performing this 
routine will always cause you to reach a fixed number: 6174. Then performing the 
routine on 6174 will always give you 6174 (7641 - 1467 = 6174). Your program should 
return the number of times this routine must be performed until 6174 is reached. 
For example: if num is 3524 your program should return 3 because of the following 
steps: (1) 5432 - 2345 = 3087, (2) 8730 - 0378 = 8352, (3) 8532 - 2358 = 6174. 
*/


class Main {  
    
  public static int result = 0;
  public static int counter = 0;
  
  public static int KaprekarsConstant(int num) { 
  
    counter++;
    if(result == OrderIntDecending(num) - OrderIntAcending(num)){
        return counter -1;
    }
    else{
        
        result = OrderIntDecending(num) - OrderIntAcending(num);
        return KaprekarsConstant(result);
    }
  
    
  } 
  
  public static int OrderIntAcending(int num){
      
      char[] char_arr_num = (Integer.toString(num)).toCharArray();
      
      Arrays.sort(char_arr_num);
      
      String new_str_num = "";
      
      for(int i = 0; i < char_arr_num.length; i++){
          new_str_num += char_arr_num[i];
      }
      
      return Integer.parseInt(new_str_num);
  }
  
  public static int OrderIntDecending(int num){
      
      char[] char_arr_num = (Integer.toString(num)).toCharArray();
      
      Arrays.sort(char_arr_num);
      
      String new_str_num = "";
      
      for(int i = char_arr_num.length -1; i >= 0; i--){
          new_str_num += char_arr_num[i];
      }
      
      return Integer.parseInt(new_str_num);
  }
  
  
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(KaprekarsConstant(s.nextLine())); 
  }   
  
}
