package java_project;
import java.util.*;
public class Recursion_3 {
//	1- recursive function to print all the permutations of a string 
	public static void printPermutation(String str,String permutation) {
		if(str.length()==0) {
			System.out.println(permutation);
			return;
		}
		for(int i=0;i<str.length();i++) {
			char currentChar=str.charAt(i);
			String newStr=str.substring(0,i)+str.substring(i+1);
			printPermutation(newStr,permutation+currentChar);
		}
	}
	
	
//	2-recursive method to count total path in a maze to move from (0,0) to (n,m)
	public static int totalPath(int i ,int j,int n,int m) {
		if (i==n || j==m)
			return 0;
		if (i==n-1&& j==m-1)
			return 1;
//	move downwards
	int downPath=totalPath(i+1,j,n,m);
//	move right
	int rightPath=totalPath(i,j+1,n,m);
	
	return downPath+rightPath;
	}
	
	
//	3-recursive function to find total no. of ways to place tiles of size 1xm in a floor of size nxm 
	public static int placeTiles(int n,int m ) {
	if (n==m)
		return 2;
	if (n<m)
		return 1;
	
//	place vertically
	int placeVertically = placeTiles(n-m,m);
//		place horizontally 
	int placeHorizontally = placeTiles(n-1,m);
	
	return placeVertically + placeHorizontally;
		
	}
	
	
//	4-recursive function to find the no of ways in which you can invite n people to your party single or in pair
	public static int callGuest (int n) {
		if (n<=1) {
			return 1;
		}
//		single
		int callSingle = callGuest(n-1);
//		pair
		int callPair = (n-1) * callGuest(n-2);		
		return callSingle+callPair;
		
	}
	
	
	
//	 5-recursive function to print all the subset of first n natural numbers
	 public static void printSubsets(ArrayList<Integer> subset) {
	       for(int i=0; i<subset.size(); i++) {
	           System.out.print(subset.get(i)+" ");
	       }
	       System.out.println();
	   }


	   public static void findSubsets(int n, ArrayList<Integer> subset) {
	       if(n == 0) {
	           printSubsets(subset);
	           return;
	       }


	       findSubsets(n-1, subset);
	       subset.add(n);
	       findSubsets(n-1, subset);
	       subset.remove(subset.size() - 1);
	   }

	
								//MAIN
	public static void main(String[] args) {
//		1- recursive function to print all the permutations of a string 
//		printPermutation("abc","");
		
		
//		2- recursive function to count total path in a maze to move from (0,0) to (n,m)
//		System.out.println(totalPath(0,0,3,3));
		
		
//		3-recursive function to find total no of ways to place tiles of size 1xm in a floor of size nxm
//		System.out.println(placeTiles(4,2));
		
		
//		4-recursive function to find the no of ways in which you can invite n people to your party single or in pair		
//		System.out.println(callGuest(4));
		
		
//		5-recursive functtion to print all the subset of first n natural numbers
		int n = 3;
	    findSubsets(n, new ArrayList<Integer> ());

	}

}
