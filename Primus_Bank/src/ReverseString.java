
public class ReverseString {
	public static void main(String[] args) {
		//Using String concatenation operator
		String str = "abc def";
		String rev = " ";
		
		for(int i=str.length()-1; i>=0;i--)
		{
			rev = rev+str.charAt(i);
		}
		System.out.println("Reversed String is :"+rev);


		String str1 = "Shiva";
		String s2 = str1.replace("i", "");
		System.out.println(s2);

		String sr = "India is my country";
		String ss = sr.replaceFirst("country", "");
		System.out.println(ss);
		
		
		String str2 = "ShivaKesav";
		String[] sk = str2.split("");
		
		for(String str3 : sk) {
			System.out.print(str3+",");
			
		}
		String s1 = "678 $56 hjy";
		
		System.out.println(s1.substring(5, 7));
		




		//using character array
		char a[] = str.toCharArray();
		int len =a.length;
		for(int i=len-1;i>=0;i--)
		{
			rev = rev+a[i];
		}
		System.out.println("Reversed String is :"+rev);

		//using buffer class
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		String st = "shiva ";
		String st1 = st.trim();
		System.out.println(st1);


	}

}
