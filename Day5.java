// Chef wants to appear in a competitive exam. To take the exam, there are following requirements:
// Minimum age limit is X (i.e. Age should be greater than or equal to X).
// Age should be strictly less than Y.Chef's current Age is A. Find whether he is currently eligible to take the exam or not.
import java.util.*;
import java.lang.*;
import java.io.*;
public class Day5 {
    public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner input =new Scanner(System.in);
	    int t= input.nextInt();
	    for(int i=0;i<t;i++){
	         int X= input.nextInt();  
	         int Y= input.nextInt(); 
	         int A= input.nextInt(); 
	         if(A>=X && A<Y){
	              System.out.println("yes");
		   } else{
		    System.out.println("no");
		
	         }
	    }
		
	}
}

    

