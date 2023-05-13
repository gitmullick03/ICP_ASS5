/*
 Program: WAP to check whether a number is twisted prime or not. 
 		  Twisted prime is a number if the number and its reverse both are prime 
 		  then it is called twisted prime.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class a5q2{
	public static void main(String z[]) {
		Scanner g=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int N=g.nextInt(),nn=0,i,n=N,c1=0,c2=0;g.close();
		for (;n!=0;n/=10)
			nn=(nn*10)+(n%10);
		for (i=2;i<N;i++)
			if (N%i==0) {c1++;}
		for (i=2;i<nn;i++)
			if (nn%i==0) {c2++;}
		if (c1==0 && c2==0) {System.out.println(N+" is a twisted prime.");}
		else {System.out.println(N+" is not a twisted prime.");}
	}
}