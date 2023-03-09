package java_project;
import java.util.*;
public class BitManipulation {
	public static void main(String[] args) {
		
		
//		Get bit
//		int bit=5; //0101
//		int pos=3;
//		int bitmask=1<<pos;
//		if((bit&bitmask)==0) {
//			System.out.println("Bit is zero");
//		}
//		else {
//			System.out.println("Bit is one");
//		}
		
		
//		Set bit
//		int bit=5;
//		int pos=1;
//		int bitmask=1<<pos;
//		
//		int num =bit|bitmask;
//		System.out.println(num);
		
		
//		clear bit
//		int bit=5;
//		int pos=2;
//		int bitmask=1<<pos;
//		
//		int notbitmask=~(bitmask);
//		int num = notbitmask & bit;
//		System.out.println(num);
		
		
//		update bit
		Scanner sc = new Scanner (System.in) ;
		System.out.println("Enter the operation you want to perform");
		int oper=sc.nextInt();
//		oper =1 :set  oper=0:clear
		int bit = 5;
		int pos = 1;
		int bitmask=1<<pos;
		if(oper==1) {
//			set 
			int num=bitmask|bit;
			System.out.println(num);
		}
		else {
//		clear
			int notbitmask=~(bitmask);
			int num=notbitmask & bit;
			System.out.println(num);
		}
		
		
				
	}

}
