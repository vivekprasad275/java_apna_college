package java_project;
import java.util.*;
public class functions {
//	public static void printMyName(String name) {
//		System.out.println(name);
//	}
	
////	addition of two numbers 
//	public static int addTwoNumbers (int a,int b) {
//		int sum=a+b;
//		System.out.println(sum);
//		return sum;
//	}
	
////	multiply two numbers
//	public static int multiply(int a ,int b) {
//		int prod = a*b;
//		System.out.println(prod);
//		return prod;
//	}
	
//	find factorial of any number
	public static void printFactorial(int a ) {
		int factorial=1;
		if(a<0) {
			System.out.println("invalid number");
			return;
		}
		for(int i=a;i>=1;i--) {
			factorial=factorial*i;
		}
		System.out.println(factorial);		
		return;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
//		System.out.println("Enter your name");
//		String nam=sc.nextLine();
//		printMyName(nam);
		
//		System.out.println("Enter both the numbers");
//		int a = sc.nextInt();
//		int b=sc.nextInt();
////		int sum=a+b;
//		addTwoNumbers(a,b);
		
//		System.out.println("Enter both the numbers");
//		int a = sc.nextInt();
//		int b=sc.nextInt();
//		multiply(a,b);
		
		System.out.println("Enter the number");
		int a = sc.nextInt();
		printFactorial(a);
		
		
		
	}

}
