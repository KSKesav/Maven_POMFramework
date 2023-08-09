import java.util.Scanner;

public class Largestof3Numbers {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter First Number");
	int a = sc.nextInt();
	
	System.out.println("Enter Second Number");
	int b = sc.nextInt();
	
	System.out.println("Enter Third Number");
	int c = sc.nextInt();
	
	//Approach 1 Logic
	
	/*if(a>b && a>c)
	{
		System.out.println(a+   "Is Largest Number ");
	}
	else if(b>a && b>c)
	{
		System.out.println(b +   "IS Largest Number");
	}
	else
	{
		System.out.println(c+   "Is Largest Number");
	}
	*/
	
	//Ternary operator
	
	//int largest1 = a>b?a:b;
	//int largest2 = c>largest1?c:largest1;
	
	int largest = c>(a>b?a:b)?c:(a>b?a:b);
	System.out.println(largest +":Is largest Number");
	
	
	
}
}
