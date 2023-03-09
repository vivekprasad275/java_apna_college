package java_project;

import java.util.Iterator;

public class Patterns {
//rows wala kam outer loops karte hain
//columns wala kam inner loops karte hain
	public static void main(String[] args) {
//		solid rectangle
//		outer loop
//		for (int i=1;i<=4;i++) {
//			inner loop
//			for (int j=1;j<=5;j++) {
//				System.out.print("*");
//				
//			}
//			System.out.println("");			
//		}
		
//		hollow rectangle 
//		int n=4;
//		int m = 5;
////		outer loop
//		for (int i=1;i<=n;i++) {
////			inner loop
//			for (int j=1;j<=m;j++) {
////				cell -> (i,j)
//				if( i==1|| j==1||i==n||j==m) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();			
//		}
		
//		half pyramid
//		int n=4;
//		
//		for (int i=1 ;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");				
//			}
//			System.out.println("");
//		}
		
//		interted half pyramid
		
//		int n=4;
//		for(int i=n;i>=1;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
//		inverted half pyramid (rotated by 180 degree)
//		int n=4;
//		for (int i=1;i<=n;i++) {
////			inner loop -> space print
//			for(int j=1;j<=n-i;j++) {
//				System.out.print(" ");
//			}
////			inner loop -> stars print
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		half pyramid with numbers
//		int n =4;
//		for (int i=1 ;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j);				
//			}
//			System.out.println("");
//		}

//		inverted half pyramid with numbers
//		int n=5;
//		for(int i=n;i>=1;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println("");
//		}
		
//		another method 
//		int n=5;
//		for (int i=1;i<=n;i++) {
//			for (int j=1;j<=n-i+1;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//		
//		floyd's triangle
//		int n=5;
//		int number=1;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(number+" ");
//				number++;
//			}
//			System.out.println();
//		}
	
//		0-1 triangle
		int n=5;
		for(int i=1;i<=n;i++) {
			for (int j=1;j<=i;j++) {
				int sum=i+j;
				if( sum %2==0) {
					System.out.print(1);
				}
				else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
