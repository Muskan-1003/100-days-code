// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

import java.util.Scanner;

public class Day6 {
     public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x= input.nextInt();
        System.out.println(reverse( x));
    }

    public static int reverse(int x) {
        boolean negative=false;
        if(x<0){
            negative=true;
            x=x*(-1);
        }
        int max_value=Integer.MAX_VALUE;
        int rev=0;

        while(x!=0){
            int rem=x%10;
            
            if(rev>(max_value-x%10)/10){
                return 0;
            }
            rev=rev*10+rem;
            x=x/10;
        }
        if(negative==true){
            rev=rev*(-1);
        }
        return rev;


    }
}