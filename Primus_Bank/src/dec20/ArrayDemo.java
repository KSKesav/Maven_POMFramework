package dec20;

import java.util.ArrayList;

public class ArrayDemo {

	public static void main(String[] args) {
		// store string type data into arraylist
		ArrayList<String> str = new ArrayList<String>();
		str.add("mon");
		str.add("tue");
		str.add("wed");
		str.add("thu");
		str.add("fri");
		str.add("sat");
		str.add("sun");
		System.out.println(str.get(6));
		for(int i=0; i<str.size(); i++)
		{
			System.out.println(str.get(i));
		}
		for (String each : str)
		{
			System.out.println(each);
		}
		

	}

}
