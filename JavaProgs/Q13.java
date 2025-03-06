//13.Java Program to Check Whether a Number can be Expressed as Sum of Two Prime Numbers.
import java.util.Scanner;
class PrimeSum {
    int flag = 0;
    int isPrime(int num) {
        if (num < 2) return 0;
        for (int i = 2; i <=num/2; i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return 1;
    }
    
    void PrimeSum(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (isPrime(i) == 1 && isPrime(n - i) == 1) {
                System.out.printf("%d = %d + %d\n", n, i, n - i);
                flag = 1;
            }
        }
        
        if (flag == 0) {
            System.out.println(n + " can't be expressed as the sum of two prime numbers.");
        }
    }
}
class Q13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        PrimeSum obj = new PrimeSum();
        obj.PrimeSum(n);
    }
}