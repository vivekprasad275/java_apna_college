package java_project;
import java.util.*;

public class Arrays {
	public static void main(String[] args) {
//		int marks []=new int[3];
//		int marks[]= {93,94,95};
//		marks[0]=97;
//		marks[1]=96;
//		marks[2]=95;
		// System.out.println(marks[0]);
		// System.out.println(marks[1]);
		// System.out.println(marks[2]);

		
//		user input array
		Scanner sc =new Scanner(System.in);
//		System.out.println("Enter size of the array");
//		int size = sc.nextInt();
//		int marks[]= new int[size];
////		loop for input 
//		for(int i=0;i<size;i++) {
//			System.out.println("enter "+i+" element in the array");
//			marks[i]=sc.nextInt();
//		}
//						
////		loop for output
//		for(int i=0;i<size;i++){
//			System.out.println("Array is "+marks[i]);
//		}		
		
			
//		take an array as an input from the user .search for a given number x and print the index at which it occurs
		int arr[]=new int[6];
		System.out.println("Enter an array of 6 elements ");
//		input 
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
//		output
		for(int i=0;i<arr.length;i++) {			
			System.out.println(arr[i]);
		}
////		for each for output 
//		for(int b:arr) {
//			System.out.println(b+" ");
//		}
		System.out.println("enter an element to find");
		int find =sc.nextInt();
		
//		search an element in array
		for(int i=0;i<arr.length;i++) {
			if (arr[i]==find) {				
				System.out.println(i);
			}
		}
		
	}
}
