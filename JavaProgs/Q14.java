// 14. Write a java program to check whether a given number is palindrome number or not.

import java.util.*;
class PN{
    void Plnd(int num){
        int rem=0;
        int rev =0,X=num;
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;   
        }
        if(X==rev){
            System.out.println(rev+" : This is a Palindrome number");
            }
        else 
            System.out.println(rev+" : This number is not Palindrome Number" );
    }
}
class Q14
{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter you number: ");
        int x=sc.nextInt();
        PN obj=new PN();
        obj.Plnd(x);
    }
}