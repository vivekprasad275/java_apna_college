package java_project;

public class Pattern_Adv {

	public static void main(String[] args) {
//		butterfly pattern
//		upper half 
//			first part
//		int n=4;
//		for(int i=1;i<=n;i++) {
//			for (int j=1;j<=i;j++) {
//				System.out.print("*"+" ");
//			}
////			spaces 
//			int spaces =2*(n-i);
//			for(int j=1;j<=spaces;j++) {
//				System.out.print("  ");
//			}
////			2nd part 
//			for (int j=1;j<=i;j++) {
//				System.out.print("*"+" ");
//			}
//			System.out.println();
//		}
//		for(int i=n;i>=1;i--) {
//			for (int j=1;j<=i;j++) {
//				System.out.print("*"+" ");
//			}
////			spaces 
//			int spaces =2*(n-i);
//			for(int j=1;j<=spaces;j++) {
//				System.out.print("  ");
//			}
////			2nd part 
//			for (int j=1;j<=i;j++) {
//				System.out.print("*"+" ");
//			}
//			System.out.println();
//		}

		
//		solid Rhombus
//		 	int n=5;
//		 	for(int i=1;i<=n;i++) {
//		 		int spaces =2*(n-i);
//				for(int j=1;j<=spaces;j++) {
//					System.out.print(" ");
//				}
//		 		for(int j=1;j<=5;j++) {
//		 			System.out.print("*");
//		 		}
//		 		System.out.println();
//			}
		
		
//		number pyramid
//		int n=5;
//		for(int i=1;i<=n;i++) {
////			spaces print
//			 int spaces= n-i;
//			 for(int j=1;j<=spaces ;j++) {
//				 System.out.print(" ");
//			 }
////			 numbers -> print row numbers ,row no. times  	
//			 for(int j=1;j<=i;j++) {
//				 System.out.print(j+" ");
//			 }
//			 System.out.println();
//		}
		
		
////		palindromic pattern pyramid
//		int n = 5;
//		for(int i=1;i<=n;i++) {
////			spaces print
//			int spaces=n-i;
//			for(int j=1;j<=spaces;j++) {
//				System.out.print(" ");
//			}
////			first part
//			for(int j=i;j>=1;j--) {
//				System.out.print(j);
//			}
////			second part
//			for(int j=2;j<=i;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		 	
		
//		diamond pattern
//		upper half
		int n= 5;
		for(int i = 1;i<=n;i++) {
//			spaces
			for(int j=1 ;j<=n-i;j++) {
				System.out.print(" ");
			}
//			stars 
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
//		lower half 
		for(int i=n;i>=1;i--) {
//			spaces
			for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
			}
//			stars
			for (int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
