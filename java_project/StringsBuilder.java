package java_project;

public class StringsBuilder {
	public static void main(String[] args) {
//		StringBuilder sb=new StringBuilder("Tony");
//		System.out.println(sb);
		
//		char at index 0
//		System.out.println(sb.charAt(0));
		
//		setCharAt() use set a character at a given index
//		sb.setCharAt(0, 'p');
//		System.out.println(sb);
		
//		insert() 
//		System.out.println(sb.insert(0, 'S'));
//		System.out.println(sb.insert(2,'n'));
		
//		deleteCharAt() use to delete a single element from the string
//		delete() use to delete for starting to ending index		
//			delete tho extra 'n'.
//		System.out.println(sb.deleteCharAt(2));
//		System.out.println(sb.delete(2, 3));
//		delete both n 
//		System.out.println(sb.delete(2,4));
		
		
//		append()
//		StringBuilder sb=new StringBuilder("h");
//		sb.append("e");
//		sb.append("l");
//		sb.append("l");
//		sb.append("o");
//		System.out.println(sb);
//		sb.reverse();
//		System.out.println(sb);
		
//		.reverse() can only be used for stringbiulder and stringbuffer 
		String str="hello world";
		String s="";
		for(int i=str.length()-1;i>=0;i--) {
			s=s+str.charAt(i);
		}
		System.out.println(s);

		
		
		
		
		
		
	}

}
