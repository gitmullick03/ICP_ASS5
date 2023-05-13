/*
 Program: WAP to enter the value of n and display find the following sum of the series:
		  1 + (1 + 2) + (1+ 2 +3) ..... + (1 + 2 + 3 + .... + n)
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class a5q8{
	public static void main(String z[]) {
		Scanner k=new Scanner(System.in);
		System.out.print("Enter a value for n: ");int N=k.nextInt(),sum1=0;k.close();
		for (int i=1;i<=N;i++) {
			int sum2=0;
			for (int j=1;j<=i;j++) {
				sum2+=j;}
			sum1+=sum2;}
		System.out.println("Sum of the series 1 + (1+2) + (1+2+3) +...+ (1+2+3+...+n): "+sum1);}}