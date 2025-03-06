//15.Write a program to generate 5 Random numbers between 1 to 100.


import java.util.*;

class RandNum{
    void rand(int num){
        int start=0,End=100;
        
        for(int i=1;i<=num;i++){
            int random=(int)(Math.random()*End);
            System.out.print(random+"  ");
           
        }
    }
}

class Q15
{
    public static void main(String []a)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the  Range: ");
        int x=sc.nextInt();
        RandNum g1=new RandNum();
        g1.rand(x);
    }
}
