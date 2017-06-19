package logics;

import java.util.Scanner;
public class hh {
	   public static void main(String args[]){
		    String str[] = "hello world".split(" ");
		    String finalStr="";
		        for(int i = str.length-1; i>= 0 ;i--){
		            finalStr += str[i]+" ";
		        }
		        System.out.println(finalStr);
		    }
		}
