
public class CountEvenandOddDigits {
	public static void main(String[] args) {
		int num=123456;
		int even_count=0;
		int odd_count=0;
		while(num>0)
		{
			int rem = num%10;    //12342    1234   123  12
			if(rem%2==0)
			{
				even_count++;
			}
			else
			{
			odd_count++;	
			}
			num=num/10;
		}
		System.out.println("Number of even numbers are:"+even_count);
		System.out.println("Number of odd numbers are:"+odd_count);
		
	}

}
