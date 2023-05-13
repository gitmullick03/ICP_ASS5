/*
 Program: Write a program to print the following outputs using for loops:
(a) A
	A B
	A B C
	A B C D
	A B C D E
(b) $ $ $ $ $
	$ $ $ $
	$ $ $
	$ $
	$
(c)         1
	      2 2
	    3 3 3
	  4 4 4 4
	5 5 5 5 5
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
public class a5q7{
	public static void main(String z[]) {
		for (char i='A';i<='E';i++) {
			for (char j='A';j<=i;j++) {
				System.out.print(j+" ");}
			System.out.println();}
		System.out.println();
		for (int i=1;i<=5;i++) {
			for (int j=5;j>=i;j--) {
				System.out.print("$ ");}
			System.out.println();}
		System.out.println();
		for (int i=1;i<=5;i++) {
			for (int k=5;k>i;k--) {
				System.out.print("  ");
			}
			for (int j=1;j<=i;j++) {
				System.out.print(" "+i);
			}
			System.out.println();}}}