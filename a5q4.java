/*
 Program: WAP to calculate and display the factorial of all numbers between m and n (where m < n, m > 0, n > 0)
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class a5q4{
	public static void main(String z[]) {
		Scanner k=new Scanner(System.in);
		System.out.print("Enter the value of m: ");long m=k.nextLong();
		System.out.print("Enter the value of n: ");long n=k.nextLong();k.close();
		if (m<n) {
			for (;m<=n;m++) {
				System.out.print("Factorial of "+m+" is: ");long fact=1;
				for (long i=1;i<=m;i++) {
					fact*=i;}
				System.out.println(fact);}}
		else {
			for (;n<=m;n++) {
				System.out.print("Factorial of "+n+" is: ");long fact=1;
				for (long i=1;i<=n;i++) {
					fact*=i;}
				System.out.println(fact);}}
}}