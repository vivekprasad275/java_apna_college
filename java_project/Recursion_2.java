package java_project;
import java.util.HashSet;
public class Recursion_2 {
// 					1- Tower of Hanoi
//	public static void towerOfHanoi(int n,String src,String helper,String dest) {
//		if(n==1) {
//			System.out.println("transfered disk "+n+" from "+src+" to "+dest);
//			return;
//		}
//	
//	towerOfHanoi(n-1,src,dest,helper);
//	System.out.println("transfered disk "+n+" from "+src+" to "+dest);
//	towerOfHanoi(n-1,helper ,src,dest);
//	}
	
	
//	  	      2 - recursion function to reverse a string
//	public static void printRev(String str,int idx ) {
//		{
//			if(idx ==0) {
//				System.out.println(str.charAt(idx));
//				return;
//			}
//		}
//		
//		System.out.print(str.charAt(idx));
//		printRev(str,idx-1);
//		
//	}
	
	
	
//	           3 - recursion function to find first and last element of a string
//	public static int first=-1;
//	public static int last =-1;
//	
//	public static void findOccurence (String str,int idx,char element) {
//		if(idx==str.length()) {
//			System.out.println(first);
//			System.out.println(last);
//			return;
//		}
//		
//		char currChar = str.charAt(idx);
//		if (currChar==element ) {
//			if(first ==-1) {
//				first =idx;
//			}
//			else {
//				last=idx;
//			}
//		}
//		findOccurence (str,idx+1,element);
//	}
	
	
	
//				4- recursive method to check if the array is shorted or not (strictly increasing)
//	public static boolean isShorted(int arr[],int idx) {
//		if(idx==arr.length-1) {
//			return true;
//		}
//														//another mothod (just opposite)
//		if (arr[idx]<arr[idx+1]) {						// if(arr[idx]>=arr[idx+1]){															
//			return isShorted(arr,idx+1);					// return false;
//		}												// }
//		else {											// else{
//			return false;								//	return isShorted(arr,idx+1);
//		}
//		
//	}
	
	
	
//				5- recursive function to move all "x" to the last of the string
//	public static void moveAllx(String str ,int idx,int count,String newString) {
//		if(idx==str.length()) {
//			for(int i =0;i<=count;i++) {
//				newString+='x';
//			}
//			System.out.println(newString);
//			return;
//			
//		}
//		char currChar = str.charAt(idx);
//		if (currChar == 'x') {
//			count++;
//			moveAllx(str,idx+1,count,newString);
//		}else {
//			newString +=currChar;
//			moveAllx(str,idx+1,count,newString);
//		}
//		
//	}
	
	
	
//				6-recursive function to remove all duplicates from a string
//	public static boolean []map=new boolean[26];
//	public static void removeDuplicates(String str,int idx,String newString) {
//		if(idx==str.length()) {
//			System.out.println(newString);
//			return;
//		}
//		
//		char currentChar = str.charAt(idx);
//		if(map[currentChar-'a']==true) {
//			removeDuplicates(str,idx+1,newString);
//		}
//		else {
//			newString+=currentChar;
//			map[currentChar-'a']=true;
//			removeDuplicates(str,idx+1,newString);
//		}
//	}
	
	
	
//			7-recursive function to print all the subsequences of a string 
//	public static void subsequences(String str,int idx,String newString) {
//		if(idx==str.length()) {
//			System.out.println(newString);
//			return;
//		}				
//		char currentChar=str.charAt(idx);				
//		//to be 
//		 subsequences(str,idx+1,newString+currentChar);
//		
//		//or not to be 
//		subsequences(str,idx+1,newString);
//	}
	
	
	
//				8-recursive function to print all unique subsequence (use HashSet)
//	public static void subsequences(String str,int idx,String newString,HashSet<String>set) {
//		if(idx==str.length()) {
//			if(set.contains(newString)) {
//				return;
//			}else {
//			System.out.println(newString);
//			set.add(newString);
//			return;
//			}
//		}				
//		char currentChar=str.charAt(idx);				
//		//to be 
//		 subsequences(str,idx+1,newString+currentChar,set);
//		
//		//or not to be 
//		subsequences(str,idx+1,newString,set);
//	}
	
	
	
//				9-recursive function to print keypad combination
	public static String[] keypad ={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	public static void printComb(String str,int idx,String combination) {
		if(idx==str.length()) {
			System.out.println(combination);
			return;
		}
		
		char currentChar= str.charAt(idx);
		String mapping =keypad[currentChar-'0'];
		for(int i=0;i<mapping.length();i++) {
			printComb(str,idx+1,combination +mapping.charAt(i));
		}
	}
	
	
	
										//MAIN 
	public static void main(String[] args) {
//		1 - tower of hanoi
//		int n=5;
//		towerOfHanoi(n,"S","H","D");
		
		
		
//		2 reverse a string
//		String str="Hello world";
//		printRev(str,str.length()-1);
		
		
		
//		3-recursion function to find the first and last occurence of any element in a string
//		findOccurence("aahnddnajksaka",0,'a');
		
		
		
//		4-recursive method to check if an array is sorted or not ( Strictly increasing )
//		int arr[]= {1,2,3,4,5};
//		System.out.println(isShorted(arr,0));
		
		
//		5-recursive method to move all "x" to the last of the string (ex: axbcxxd)
//		String str="axbcxxd";
//		moveAllx(str,0,0,"");

				
//		6-recursive function to remove all duplicates element from a string
//		removeDuplicates("gfgraagzzexbcdeabx",0,"");
		
		
//		7-recursive function to print the subsequence of a string
//		subsequences("abc",0,"");
		
		
//		8-recursive function to print all unique subsequence (using HashSet)
//		String str1= "abc";
//		String str2="aaa";
//		HashSet<String>set=new HashSet<>();
//		subsequences(str2,0,"",set);
		
		
//		9-recursive function to print keypad combination 
//		String str="23";
//		printComb(str,0,"");

		
		
		
	}

}
