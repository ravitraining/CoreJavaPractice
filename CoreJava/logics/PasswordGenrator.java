package logics;

import java.util.Scanner;

public class PasswordGenrator {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter Alphabetics");
	String s1=scn.next();
	System.out.println("Enter Numbers");
	String s2=scn.next();
	System.out.println("Enter Special Sysmbolo");
	String s3=scn.next();
	System.out.println(s1+"..."+s2+"..."+s3);
	
	
}
}

