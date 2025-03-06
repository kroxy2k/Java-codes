//Write a java program to print first 10 numbers in Fibonacci sequence. Also print the sum of the numbers.
class fib{
    int n1=0,n2=1,n3,sum;
    void fibo(int n){
        System.out.print(n1+" "+n2);
        for (int i =3; i <= n; i++) {
            n3=n1+n2;
            System.out.print(" "+n3);
		sum+=n3;
            n1=n2;
            n2=n3;
    }
    System.out.println("\nSum of Fibonacci : "+sum);
}
}
public class Q1{
    public static void main(String[] args) {
        fib A = new fib();
        A.fibo(10);
    }
    
}
