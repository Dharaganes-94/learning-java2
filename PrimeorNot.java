package Task8;

import java.util.Scanner;

public class PrimeorNot {
    public static void main(String[] args) {
    	
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter a number to check  prime number or not: ");
        
        int num= sc.nextInt();
        
        if(isPrime(num)) {
            System.out.println(num + " is prime number");
        }
        else{
            System.out.println(num + " is a not prime number");
        }
    }
    static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
       for(int i=2;i<=num/2;i++)
       {
           if((num%i)==0)
               return  false;
       }
       return true;
    }
}

