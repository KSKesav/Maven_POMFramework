package dec20;

public class TryCatch {

	public static void main(String[] args) {
		//divide any thing with zero
		try {
			int a = 8686,b= 0, c;
			c=a/b;
			System.out.println(c);
		}catch (Throwable t)
		{
			System.out.println(t.getMessage());
		}
		double x = 5555555, y=55, z;
		z=x/y;
		System.out.println(z);
	}

}
