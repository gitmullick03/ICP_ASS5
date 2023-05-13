/*
 Program: WAP to enter the first number and second number. 
 		  Display the prime numbers between the first and second number.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class a5q3{
	public static void main(String z[]) {
		Scanner k=new Scanner(System.in);
		System.out.print("Enter the first number: ");int n1=k.nextInt();
		System.out.print("Enter the second number: ");int n2=k.nextInt();k.close();
		System.out.print("Prime numbers between "+n1+" and "+n2+" are: \n");
		for (;n1<=n2;n1++) {
			int c=0;
			for (int i=2;i<n1;i++) {
				if (n1%i==0)c++;}
			if (c==0)System.out.print(n1+"  ");}}}