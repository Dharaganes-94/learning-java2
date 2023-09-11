package Task8;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    int first=10,second=20;
		    
		    Scanner sc = new Scanner(System.in);
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		
        System.out.println("--Before swap--");
	    System.out.println("First = " + a);
		System.out.println("Second = " + b);

		   a = a - b;
		   b = a + b;
		   a = b - a;

		System.out.println("--After swap--");
	    System.out.println("First number = " + a);
		System.out.println("Second number = " + b);
		    }
		}
		