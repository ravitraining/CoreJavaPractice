package logics;

import java.util.Scanner;

public class StringLogics {
public static void main(String[] args) {
	String s1,s2;
	Scanner scn=new Scanner(System.in);
	s1=scn.nextLine();
	s2=scn.nextLine();
	
	String s3=s1.concat(s2);
	System.out.println(s3);
	int l1=s1.length();
	int l2=s2.length();
	System.out.println(l1+"..."+l2);
}
}
