package dec28;

public class MethodDemo {
	public static void add (int x, int y)
	{
		int z = x+y;
		System.out.println(z);
	}
	public static double division (double a, double b)
	{
		double c= a/b;
		return c;
	}
	public static String verifystrings (String str1, String str2)
	{
		String res = "";
		if(str1.equals(str2))
				{
			res = "strings are equal";
				}else 
				{
					res = "strings are not equal";
				}
				return res;
	}

	public static void main(String[] args) {
		MethodDemo.add(888, 222);
		double x = MethodDemo.division(888, 222);
		System.out.println(x);
		String result = MethodDemo.verifystrings("Shiva","Shiva");
		System.out.println(result);

	}

}
