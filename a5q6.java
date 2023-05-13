/*
 Program: Write a program to print the following outputs using for loops:
		  (a) *
 			  * *
 			  * * *
 			  * * * *
 			  * * * * *
		  (b) 1
			  2 2
			  3 3 3
			  4 4 4 4
			  5 5 5 5 5
		  (c) 1
			  2 3
			  4 5 6
			  7 8 9 10
			  11 12 13 14 15
		  (d) 1
			  1 2
			  1 2 3
			  1 2 3 4
			  1 2 3 4 5
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
public class a5q6{
	public static void main(String z[]) {
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print("* ");}
			System.out.println();}
		System.out.println();
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(i+" ");}
			System.out.println();}
		System.out.println();
		int k=1;
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(k++ +" ");}
			System.out.println();}
		System.out.println();
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(j+" ");}
			System.out.println();}
		System.out.println();}}