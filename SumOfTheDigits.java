package Recursion;
import java.util.Scanner;
public class SumOfTheDigits {
public static int sumOfDigits(int digit,int sum) {
	if(digit==0) {
		return sum;
	}else {
		sum+=digit%10;
		return sumOfDigits(digit/10,sum);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int digit=sc.nextInt();
		System.out.println("the sumof the digits:"+sumOfDigits(digit,0));

	}

}
