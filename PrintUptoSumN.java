package Recursion;
import java.util.Scanner;
public class PrintUptoSumN {
public static int sumOfNumbers(int n,int sum) {
	if(n==0) {
		return sum;
	}else {
		sum+=n;
		return sumOfNumbers(n-1, sum);
	}
}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		System.out.println("The sumof the numbers upto n: "+sumOfNumbers(n,0));
	}

}
