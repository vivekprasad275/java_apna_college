package java_project;
import java.util.*;
public class Recursion_1 {
	
//	print numbers 5 to 1 using recursion 
//	public static void printNumb(int n) {
//		if(n==0) {
//			return;			
//		}		
//		System.out.println(n);
//		printNumb(n-1);
//	}
	
	
//	print numbers from 1-5
//	public static void printNumb(int n) {
//		if(n==6) {
//			return;
//		}
//		
//		System.out.println(n);
//		printNumb(n+1);
//	}
	
	
//	recursion to find sum of N natural numbers
//	public static int sumOfnNaturalnumbers(int num) {
//		if(num==1) {
//			return 1;
//		}
//		else {
//			return num+sumOfnNaturalnumbers(num-1);
//		}
//	
//	}
	
	
//	2-Anoter method 
//	public static void printSum(int i,int n,int sum) {
//		if(i==n) {
//			sum=sum+i;
//			System.out.println(sum);
//			return;
//		}
//		sum=sum+i;
//		printSum(i+1,n,sum);
//	}
	
	
//	3 recursion funtion to print factorial of number n
//	public static int printFact(int n) {
//		if(n==0 || n==1) {
//			return 1;
//		}
//		int calFact = printFact(n-1);
//		int res=n*calFact;
//		return res;
//	}
	
	
//	4 recursion function to print fibonachi series
//	public static void printFib(int a,int b,int n) {
//		if(n==0) {
//			return;
//		}
//		int c=a+b;
//			System.out.print(c+" ");
//			printFib(b,c,n-1);
//	}
	
	
//	5 print x^n using recursion
//	public static int calPow(int x ,int n) {
//		if(x==0) {
//			return 0; //base case 1 
//		}
//		if(n==0) {
//			return 1; //base case 2
//		}
//		int xPowmn =calPow(x, n-1); //kaam
//		int xPown=x*xPowmn;
//		return xPown;
//	}
	
	
//	//		5 calculate x^n having stack height logn 

	public static int calPow(int x ,int n) {
		if(x==0) {
			return 0; //base case 1 
		}
		if(n==0) {
			return 1; //base case 2
		}
//		if n is even
		if (n%2==0) {
			return calPow (x,n/2)*calPow(x,n/2);
		}
		else {
			return calPow (x,n/2)*calPow(x,n/2)*x;
		}
	
	}
	
	
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n=1;
//		printNumb(n);
		
//		2 
//		System.out.println("Enter the number ");
//		int num = sc.nextInt();
//		System.out.println(sumOfnNaturalnumbers(num));
		
//		2 Another method
//		printSum(1,5,0);
		
		
//		3 factorial 
//		int n=5;
//		int result =printFact(n);
//		System.out.println(result);

		
//		4 fibonachi series
//		int a=0,b=1,n=7;
//		System.out.print(a+" ");
//		System.out.print(b+" ");
//		printFib(a,b,n-2);

		
//		5 calculate x^n
//		int x=2,n=5;
//		int result=calPow(x,n);
//		System.out.println(result);
		
		
//		5 calculate x^n having stack height logn 
		int x=2,n=5;
		int result=calPow(x,n);
		System.out.println(result);
		
	}

}
