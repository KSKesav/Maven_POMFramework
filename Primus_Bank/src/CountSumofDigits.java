
public class CountSumofDigits {
	public static void main(String[] args) {
		int num=123456789;
		int sum=0;
		while(num>0)
		{
			sum=sum+num%10;        //0+9
			num = num/10;
		}
		System.out.println("Sum of digits in a number:  "  +sum);
	}

}
