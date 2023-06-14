//  Count Primes
// Given an integer n, return the number of prime numbers that are strictly less than n.
//  Input: n = 10
// Output: 4
// Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 import java.util.Scanner;
public class Day8 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n =input.nextInt();
        Day8 sieve = new Day8();  //day8-->SieveOfEratosthenes
        int count = sieve.countPrimes(n);

        System.out.println(count);

    }

    public int countPrimes(int n) {
        if(n<=2) return 0;
        boolean[] composites=new boolean[n];
        for(int i=2; i<=Math.sqrt(n); i++ ){
            if(composites[i]==false){
                for(int j=i*i; j<n; j=j+i){
                    composites[j]=true;
                }
            }
        }
        int count = 0;
        for(int i=2; i<n; i++){
            if(composites[i]==false){
                count++;
            }

        }
        return count;
    }
}

