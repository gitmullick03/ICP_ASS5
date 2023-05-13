/*
 Program: Given a=0, b=1 and c=1 are the first three numbers of some sequence. 
 		  All other numbers in the sequence are generated from the sum of their three most recent predecessors.
 		  Write a java program to generate this sequence up to n terms where n > 3.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class a5q10{
	public static void main(String z[]) {
		Scanner k=new Scanner(System.in);
		System.out.print("Enter any number n greater than 3: ");
		int n=k.nextInt(),a=0,b=1,c=1,d;k.close();
		System.out.print("\nSequence upto n terms is: "+a+" "+b+" "+c);
		for(int i=1;i<=(n-3);i++) {
			d=a+b+c;
			System.out.print(" "+d);
			a=b;b=c;c=d;}
		System.out.println("\n\nEOF");}}