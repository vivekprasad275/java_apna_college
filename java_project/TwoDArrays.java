package java_project;
import java.util.*;
public class TwoDArrays{  
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the numbers of rows and columns");
//        int rows =sc.nextInt();
//        int cols =sc.nextInt();
//        int numbers[][]=new int[rows][cols];
        // input 
        // rows
//        System.out.println("Enter the elements of 2D array ");
//        for(int i=0;i<rows;i++){
//            // columns
//            for(int j=0;j<cols;j++){
//                numbers[i][j]=sc.nextInt();
//
//            }
//        }
        // output
//        System.out.println("The elements of 2D array ");
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<cols;j++){
//            System.out.print(numbers[i][j]+" ");
//            }
//            System.out.println();
//            
//        }
//scearching for index no
//System.out.println("Enter element to search");
//int inp=sc.nextInt();
//for(int i=0;i<rows;i++){ 	
//    for(int j=0;j<cols;j++){
//    	if(numbers[i][j]==inp) {
//    		System.out.println("The index of the is "+i+","+j);
    		
    		
//    	}

//    }
//	}
    	
    	
    	
//    		spiral order matrix traversal problem
    	
//    	Scanner sc=new Scanner(System.in);
//    	System.out.println("Enter the numbers of rows and columns");
//    	int n =sc.nextInt();
//    	int m =sc.nextInt();
//    	int matrix[][] = new int[n][m];
////    	input 
//        for(int i=0; i<n; i++) {
//             for(int j=0; j<m; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//        }
//
//
//        System.out.println("The Spiral Order Matrix is : ");
//        int rowStart = 0;
//        int rowEnd = n-1;
//        int colStart = 0;
//        int colEnd = m-1;
//
//
//        //To print spiral order matrix
//        while(rowStart <= rowEnd && colStart <= colEnd) {
//            //1
//            for(int col=colStart; col<=colEnd; col++) {
//                System.out.print(matrix[rowStart][col] + " ");
//            }
//            rowStart++;
//
//
//            //2
//            for(int row=rowStart; row<=rowEnd; row++) {
//                System.out.print(matrix[row][colEnd] +" ");
//            }
//            colEnd--;
//
//
//            //3
//            for(int col=colEnd; col>=colStart; col--) {
//                System.out.print(matrix[rowEnd][col] + " ");
//            }
//            rowEnd--;
//
//
//            //4
//            for(int row=rowEnd; row>=rowStart; row--) {
//                System.out.print(matrix[row][colStart] + " ");
//            }
//            colStart++;
//
//
//            System.out.println();
//        }

    	
    	
//    	program to transpose a matrix
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the numbers of rows and columns");
    	int n =sc.nextInt();
    	int m =sc.nextInt();
    	int matrix[][] = new int[n][m];
//    	input in matrix
    	System.out.println("Enter the elements ");
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<m;j++) {
    			matrix[i][j]=sc.nextInt();
    		}
    	}
//    	array matrix
    	System.out.println("Array matrix");
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<m;j++) {    			
    			System.out.print(matrix[i][j]+" ");   			
    		}
    		System.out.println();
    	}
//    	transpose
//    	System.out.println("Transpose matrix");
//    		for(int j=0;j<m;j++) {    			
//    			for(int i=0;i<n;i++) {
//    			System.out.print(matrix[i][j]+" ");   			
//    		}
//    		System.out.println();
//    	}

//    	anoter mothod
    		System.out.println("Transpose matrix");
    			for(int i=0;i<m;i++) {
    				for(int j=0;j<n;j++) {    			
    			System.out.print(matrix[j][i]+" ");   			
    		}
    		System.out.println();
    	}
    	
   }
}