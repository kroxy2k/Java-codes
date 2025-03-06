//3. Write a java program to print a Fibonacci sequence where only first 8 positive prime
//numbers are present. Also print the prime numbers separately.
class PrimeFibonacci {
  
    int isPrime(int num) {
        int flag = 0;
        if (num < 2) return flag;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                flag = 0;
                return flag;
            }
        }
        flag = 1;
        return flag;
    }
    
    void Fibo(int n) {
        int n1 = 0, n2 = 1, n3;
        System.out.print("Fibonacci series: " + n1 + " " + n2 + " ");
        for (int i = 2; i < n; i++) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }
    
    void PrimeFibo(int n) {
        int count = 0, num = 2, n1 = 0, n2 = 0;
        System.out.print("Prime Fibonacci sequence: ");
        while (count < n) {
            if (isPrime(num) == 1) {
                if (count == 0) {
                    n1 = num;
                    System.out.print(n1 + " ");
                } else if (count == 1) {
                    n2 = num;
                    System.out.print(n2 + " ");
                } else {
                    int n3 = n1 + n2;
                    System.out.print(n3 + " ");
                    n1 = n2;
                    n2 = n3;
                }
                count++;
            }
            num++;
        }
        System.out.println();
    }
}

public class Q3 {
    public static void main(String[] args) {
        PrimeFibonacci pf = new PrimeFibonacci();
        int n = 8;
        pf.Fibo(n);
        pf.PrimeFibo(n);
    }
}
