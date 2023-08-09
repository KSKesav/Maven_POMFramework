import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num =sc.nextInt();  //1234
		// using algorithm
		int rev = 0;
		while(num!=0)
		{
			rev = rev*10+num%10;
			num= num/10;
		}
		
		// using stringbuffer class
		//StringBuffer sb = new StringBuffer(String.valueOf(num));
		//StringBuffer rev = sb.reverse();
		
		
		// Usong StringBuilder class
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev1 = sbl.reverse();
		
		System.out.println("Reverse number is :"+ rev1);

	}

}
