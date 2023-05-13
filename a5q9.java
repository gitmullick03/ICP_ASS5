/*
 Program: Write a program that will read the value of n from the user and calculate sum of the following series:
		  (1/1^2) + (1/2^2) + (1/3^2) + (1/4^2)+ ... + (1/n^2).
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class a5q9{
	public static void main(String z[]) {
		Scanner k=new Scanner(System.in);
		System.out.print("Enter a value for n: ");double n=k.nextDouble();double sum=0;k.close();
		for (double i=1;i<=n;i++) {
			sum+=(1/(i*i));}
		System.out.println("Sum of the sequence (1/1^2) + (1/2^2) + (1/3^2) + (1/4^2)+ ... + (1/n^2): "+sum);}}