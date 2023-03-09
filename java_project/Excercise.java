package java_project;
import java.util.*;
public class Excercise {
//	qstn 1(3 no avg)
//	public static void calAvg(int a ,int b,int c) {
//		System.out.println(((a+b+c)/3));
//		return ;
//	}
	
	
//	qstn 2 (sum of n odd no.)
//	public static void sumOdd(int n) {
//		int sum=0;
//		for(int i=1;i<=n;i++) {
//			if(i%2!= 0) {
//				sum=sum+i;							
//			}
//			
//		}
//		System.out.println(sum);
//		return;
//	}
	
	
//	qstn 3(greater no in 2 numbers)
//	public static void greaterIn2no(int a ,int b) {
//		if (a>b) {
//			System.out.println(a+" is greater");
//		}
//		else {
//			System.out.println(b+" is greater");
//		}
//		return;
//	}
	
	
//	qstn 4 (circumference of a circle)
//	public static void getCircumference(int r) {
//		double cir=2*Math.PI*r;
//		System.out.println("circumference of the circle is "+cir);
//		return;
//	}
	
	
//	qstn 5 (person is eligible to vote or not)
//	public static void isEligible (int age) {
//		if(age>=18) {
//			System.out.println("person is eligible to vote ");			
//		}
//		else {
//			System.out.println("person is not eligible to vote ");
//		}
//		return;
//	}
//	
	
//	qstn 8(find x^n)
//	public static void getPower(int x,int n) {
//		System.out.println(Math.pow(x, n));
//		return ;
//	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
//	qstn 1 
//		System.out.println("Enter 3 no.");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		calAvg(a,b,c);
		
		
//		qstn 2
//		System.out.println("Enter the no");
//		int n=sc.nextInt();
//		sumOdd(n);
		
		
//		qstn 3
//		System.out.println("Enter both the numbers");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		greaterIn2no(a,b);

		
//		qstn 4
//		System.out.println("Enter the no");
//		int n=sc.nextInt();
//		getCircumference(n);

		
//		qstn 5
//		System.out.println("Enter your age");
//		int age=sc.nextInt();
//		isEligible(age);
		
		
//		qstn 6
//		do {
//			System.out.println("hi");
//		}
//		while (true);
		
		
//		qstn 7
//		int pos=0,neg=0,zer=0;
//		System.out.println("press 1 to continue and 0 to stop");
//		int input=sc.nextInt();
//		while(input==1) {
//			System.out.println("Enter the no.");
//			int num=sc.nextInt();
//			if(num>0) {
//				pos++;
//			}
//			else if(num<0) {
//				neg++;
//			}
//			else {
//				zer++;
//			}
//			System.out.println("press 1 to continue and 0 to stop");
//			input=sc.nextInt();
//		}
//		System.out.println("no. of positive no is "+pos);
//		System.out.println("no. of negative no is "+neg);
//		System.out.println("no. of zero is "+zer);


//		qstn 8
//		System.out.println("Enter both the numbers");
//		int x = sc.nextInt();
//		int n = sc.nextInt();
//		getPower(x,n);
//		
		
//		qstn 9(greatest common divisor of two numbers)
//		System.out.println("Enter both the numbers");
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		 int g=0;
//		for (int i=1;i<=a;i++) {
//			if(a%i==0&&b%i==0) {
//				g=i;
//			}			
//		}
//		System.out.println(g);
//		another method		
//		 while(n1 != n2) { 
//	           if(n1>n2) {
//	               n1 = n1 - n2;
//	           } else {
//	               n2 = n2 - n1;
//	           }
//	       }
//	       System.out.println("GCD is : "+ n2);
		
		
//		qstn 10(fibonacci series : in fibonacci series a no. is sum of previous 2 nos.that came before it)
//		int term,a=0,b=1,temp;
//		System.out.println("Enter the numbers");
//		term = sc.nextInt();
//		
//		for(int i=1;i<=term;i++) {
//			System.out.println(a);
//			temp=a+b ;			
//			a=b;
//			b=temp;		
//		}
//		another method(apna college)
//		 int n = sc.nextInt();
//	      
//	       int a = 0, b = 1;
//	          
//	       System.out.print(a+" ");
//	      
//	       if(n > 1) {
//	           //find nth term
//	           for(int i=2; i<=n; i++) {
//	               System.out.print(b+" ");
//	               //the concept below is called swapping
//	               int temp = b;
//	               b = a + b;
//	               a = temp;
//	           }
//	           System.out.println();
//	       }
//tribonachi series
		int term,a=0,b=1,c=2,d,temp;
		System.out.println("Enter the numbers");
		term = sc.nextInt();
		
		for(int i=1;i<=term;i++) {
			System.out.println(a);
			temp=a+b+c ;			
			a=b;
			b=c;
			c=temp;
		}
	}
}
