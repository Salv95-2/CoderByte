import java.util.*; 
import java.io.*;
/*
Using the Java language, have the function ChessboardTraveling(str) read str which will be a string consisting
of the location of a space on a standard 8x8 chess board with no pieces on the board along with another space on
the chess board. The structure of str will be the following: "(x y)(a b)" where (x y) represents the position you 
are currently on with x and y ranging from 1 to 8 and (a b) represents some other space on the chess board with a 
and b also ranging from 1 to 8 where a > x and b > y. Your program should determine how many ways there are of 
traveling from (x y) on the board to (a b) moving only up and to the right. For example: if str is (1 1)(2 2) then 
your program should output 2 because there are only two possible ways to travel from space (1 1) on a chessboard to 
space (2 2) while making only moves up and to the right. 
*/
class Main {  
  public static String ChessboardTraveling(String str) { 
  
    char [] chars = str.toCharArray();
    
    ArrayList<Integer> vals = new ArrayList<Integer>();
    
    for(int i = 0; i < chars.length; i++){
        
        if(Character.isDigit(chars[i])){
            vals.add(Character.getNumericValue(chars[i]));
        }
    }   
    int x = vals.get(0);
    int y = vals.get(1);
    int a = vals.get(2);
    int b = vals.get(3);
    
    
       
    return str;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(ChessboardTraveling(s.nextLine())); 
  }   
  
}








  
