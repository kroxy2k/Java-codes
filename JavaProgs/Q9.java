//  9. Write a java program to print sum of n terms in the series 1/1! +1/2!+1/3!.....+1/n!.

import java.util.*;

class sumfac{
    void fact(int num){
        int i,fact=1;
        float sum=0;
        for(i=1;i<=num;i++){
            fact*=i;
            sum+=(float) 1/fact;
        }
        
        System.out.print("Sum of this series: "+sum); 
    }
}
class Q9{
    public static void main(String []a){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n th term :");
        n=sc.nextInt();
        sumfac obj=new sumfac();
        obj.fact(n);
    }
}
