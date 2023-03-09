package java_project;
import java.util.*;
public class Sum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a ;
		int b;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		a=sc.nextInt();
		System.out.println("Enter second number");
		b = sc.nextInt();
//		int s=a+b;
//		System.out.println("The sum of a and b is "+s);
//		if(a%2==0) {
//			System.out.println("The no. is even");
//			
//		}
//		else {
//			System.out.println("The no. is odd");
		if (a==b) {
		System.out.println("equal");		
		}
		else if(a>b) {
			System.out.println("a is greater");
		}
		else {
			System.out.println("b is greater");
		}
		
	}

}
