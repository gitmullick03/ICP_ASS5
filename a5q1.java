/*
 Program: Amicable numbers are pair of numbers each of whose divisors are added to give the other number.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class a5q1
{
	public static void main(String z[]) 
	{
		Scanner k=new Scanner(System.in);
		System.out.print("Enter first number: ");int n1=k.nextInt();
		System.out.print("Enter second number: ");int n2=k.nextInt();
		int s1=0,s2=0,x=n1-1,y=n2-1;k.close();
		while(x!=0) {if (n1%x==0)s1+=(x);x--;}
		while(y!=0) {if (n2%y==0)s2+=(y);y--;}
		if (s1==n2 && s2==n1)
			System.out.println("\n"+n1+" and "+n2+" are amicable numbers.");
		else
			System.out.println("\n"+n1+" and "+n2+" are not amicable numbers.");
}}