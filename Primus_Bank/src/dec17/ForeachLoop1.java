package dec17;

public class ForeachLoop1 {

	public static void main(String[] args) {
		// store string type data into array
		String str[] = {"mon","tue","wed","thu","fri","sat","sun"};
		System.out.println(str[5]);
		for(String each : str)
		{
			
			System.out.println(each);
		}

		//		int i[] = {20,30,40,50,60};
		//		                      for (int each : i)
		//		{
		//			if(each = Math.max(20, 60))
		//			                             {
		//				
		//			}
		//			System.out.println(each);
		//		}


	}

}
