package may19;

public class countcharecters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcc dddcef";
		char ch = 'c';
		char ch1 = 'd';
		int count = 0;
		
		for(int i = 0; i<str.length();i++)
		{
			if(str.charAt(i) == ch) //&& str.charAt(i) == ch1)
			{
				count++;
			}
//			if(str.contains(ch1)) {
				
//			}
		
		}
		
      System.out.println(count );
	}

}
