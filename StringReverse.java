package logics;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		Scanner s=new Scanner(System.in);
		String st=s.next();
		StringBuffer sb=new StringBuffer(st).reverse();
		System.out.println("The reversed string is :"+sb);
		
	}
}
