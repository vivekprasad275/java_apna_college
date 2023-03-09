package java_project;
import java.util.*;
public class Sorting {
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");		
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		int arr[]= {7,8,3,2,1,4};
		
		
//		bubble sorting
//		for(int i=0;i<arr.length-1;i++) {
//			for (int j=0;j<arr.length-i-1;j++) {
//				if(arr[j]>arr[j+1]) {
////				swap
//					int temp;
//					temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;				
//				}			
//			}
//		}
//		printArray(arr);
//		
		
//		selection sort
//		for (int i =0;i < arr.length;i++) {
//			int smallest=i;
//			for(int j =i+1;j<arr.length;j++) {
//				if(arr[smallest]>arr[j]) {
//					smallest=j;
//				}
//			}
//			int temp=arr[smallest];
//			arr[smallest]=arr[i];
//			arr[i]=temp;
//		}
//		printArray(arr);
		
		
//		insertion sort
		
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			int j=i;
			while(j>0&& arr[j-1]>temp) {
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=temp;
		}
		printArray(arr);
	}
}
