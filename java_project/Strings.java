package java_project;
import java.util.*;
public class Strings {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your name");
//		String name=sc.nextLine();
//		System.out.println("your name is "+name.length());
////	charAt
//		for(int i=0;i<name.length();i++) {
//			System.out.println(name.charAt(i));
//	}
			
//			comparing stings are equal or not
//		1 s1>s2 +ve value 
//		2 s1=s2 0
//		3 s1<s2 -ve value
			String name1="vivek";
			String name2="vivek";
//			if(name1.compareTo(name2)==0) {
//				System.out.println("Strings are equal");
//			}
//			else {
//				System.out.println("Strings are not equal");
//			}
//			another method 
//			if(name1.equals(name2)) {
//				System.out.println("strings are equal");
//			}
//			else {
//				System.out.println("strings are not equal");
//			}
//			s1==s2 may not always be true
			
			
//			sub string from a string
//			String str = "My name is vivek";
////			String.substring(starting index ,ending index);
//			System.out.println(str.substring(11,16));
			
			
//			parseInt method of integer class
//			String str="123";
//			System.out.println(str);
//			int num =Integer.parseInt(str);
//			System.out.println(num);
			
			
//			ToString method
//			int num=1234;
//			String str=Integer.toString(num);
//			System.out.println(str);
			
			
//			Take an array of string input from the user and find the combined length of string
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter the size of array");
//			int s=sc.nextInt();
//			String arr[]=new String[s];
//			
//			System.out.println("Enter the elements");
////			input
//			for (int i=0;i<arr.length;i++) {
//				arr[i]=sc.next();
//			}
//			int count=0;
////			output
//			for(int i=0;i<arr.length;i++) {
////			to count the length of string array
//				count=count+arr[i].length();
//			}
//			System.out.println(count);
			
						
//			input a string from the user .create a new string called 'result' in which you will replace the letter 'e' in the original string with letter 'i'.
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter the string ");
//			String str=sc.nextLine();
//			
//			String result=new String();
//			for(int i=0;i<str.length();i++) {
//				result=str.replace('e', 'i');
//			}
//			System.out.println(result);
			
			
//			input an email from the user .you have to create a username from the email by deleting the part that comes after '@'.Display the username to the user.
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string ");
			String email=sc.nextLine();
			
			String user=new String();
			for(int i=0;i<email.length();i++) {
				if(email.charAt(i)=='@') {
					break;
				}
				else {
					user=user+email.charAt(i);
				}
			}
			System.out.println(user);
	}
}
