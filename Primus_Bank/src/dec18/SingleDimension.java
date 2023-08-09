package dec18;

public class SingleDimension {

	public static void main(String[] args) {
		int x [] = new int[5];
		x[0]=100;
		x[1]=400;
		x[2]=900;
		x[3]=600;
		x[4]=500;
		System.out.println(x.length);
		for(int each : x)
		{
			System.out.println(each);
		}
	}

}
