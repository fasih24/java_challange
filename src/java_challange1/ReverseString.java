package java_challange1;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
	String name=new String();
	name="fasih";

//	Scanner s=new Scanner(System.in);
//	System.out.println("enter name ");
//	name=s.next();
	String [] rev=name.split("");
	//char [] rev=name.toCharArray();
	   
	for(int i=rev.length-1;i>=0;i--) {
		System.out.print(rev[i]);
	}
	
	  // String input = "Geeks for Geeks";
	   
       StringBuilder input1 = new StringBuilder();

       // append a string into StringBuilder input1
       input1.append("tamur");

       // reverse StringBuilder input1
       input1 = input1.reverse();

       // print reversed String
       System.out.println(input1);
	
	
	}

}
