// Class: CS 5000/01
// Term: Spring 2018
// Name: Steve Herchenroder
// Instructor: Dr. Haddad
// Assignment: 1

/* SumDigit
A Pprogram to read an integer number between 0 and 9999 from the user, and 
then display the sum of the digits in that number.
*/

// connect to util libarary, scanner object
import java.util.Scanner; 

// name the class, and file 
public class SumDigit
{

// required main method declaration to be able to execute staments
   public static void main (String[] args) 
   { 
      int i0, i1,ir, i2,i3,i4,sum;  // declare variables
   
     // initate scanner to read from keyboard
      Scanner scan = new Scanner (System.in); 
     
     // input a four digit integer, assign it to variable  
      System.out.print ("\n\nEnter a four digit integer: "); 
      i0 = scan.nextInt(); 
      
      // decompose the integer (base 10 number)into individual digits 
      i4 = i0%10;  //fourth digit
      ir = i0/10;  //  get remainder 1
      i3= ir%10 ;  //third digit
      ir =ir/10 ;  //  get remainder 2
      i2 =ir%10 ;  //second digit
      ir=ir/10 ;   //  get remainder 3
      i1=ir%10 ;   //first digit
       
      //calculate summ of digits
      sum = i1 + i2 + i3 + i4;
      
      // Output to console the original integer and the sum of the digits
      // more then 4 digits input takes only the last four digits
      System.out.println (" SumDigit Program  "  );
      System.out.println ("The 4 digit Integer input is: " + i1 + i2 + i3 + i4); 
      System.out.println (" The sum of the digits is:  " + sum );
   }

}