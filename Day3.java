import java.util.Scanner;
// Subtract the Product and Sum of Digits of an Integer
// Given an integer number n, return the difference between the product of its digits and the sum of its digits.Input: n = 234
// Output: 15 
// Explanation: 
// Product of digits = 2 * 3 * 4 = 24 
// Sum of digits = 2 + 3 + 4 = 9 
// Result = 24 - 9 = 15
public class Day3{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int n= input.nextInt();
        System.out.println(productandsum(n));
    }
    public static int productandsum(int n){
        int sum =0;
        int prod=1;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            prod*=rem;
            n=n/10;
        }
        return prod - sum;

    }
}
