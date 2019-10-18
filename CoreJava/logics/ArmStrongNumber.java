package logics;

import java.util.Scanner;

public class ArmStrongNumber {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=scn.nextInt();
	int num1=0;
	int temp=num;
	while(num>0)
	{
		int reminder=num%10;
		num1=num1+(reminder*reminder*reminder);
		num=num/10;
	}
	System.out.println(num1+".."+temp);
	if(num1==temp)
	{
		System.out.println("The number is Armstrong number");
	}
	else
	{
		System.out.println("The number is not a armstrong  number");
	}
}
}
