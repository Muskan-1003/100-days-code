//Chef and Chefina are playing with dice. In one turn, both of them roll their dice at once.
// They consider a turn to be good if the sum of the numbers on their dice is greater than 6
// Given that in a particular turn Chef and Chefina got  X and  Y on their respective dice, find whether the turn was good.
import java.util.*;
import java.lang.*;
import java.io.*;
public class Day4 {
    public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner input=new Scanner(System.in);
	   int t=input.nextInt();
	   for(int i=0; i<t;i++){
	       int n1=input.nextInt();
	       int n2=input.nextInt();
	       if((n1+n2)>6){
	           System.out.println("yes");
	       }else{
	             System.out.println("No");
	       }
	   }
	
	}
}


