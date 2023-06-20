/*You are given an integer n, you have to convert it into a string.
Please complete the partially completed code in the editor. 
If your code successfully converts n into a string s the
code will print "Good job". Otherwise it will print "Wrong answer".
can range between -100 to  100 inclusive. */


import java.util.*;

public class Day9 {

    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        String s=" ";
        if(n>=-100 && n<=100){
          s=Integer.toString(n);
          if(n==Integer.parseInt(s)){
              System.out.println("Good job");
          }else{
               System.out.println("Wrong answer");
          }
       }
    }
}
