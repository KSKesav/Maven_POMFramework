package jun27;

public class JavaString1 {
	public static void main(String[] args) {
		String s = "TesTinG is my  Job";
		String rev ="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev+(s.charAt(i));
			s.toUpperCase();
		}
		System.out.println(rev);
		
		String str = s.replaceAll("TesTing", " ");
		System.out.println(str);

		StringBuffer s2 = new StringBuffer("KesaVulu");
		System.out.println(s2.reverse());
	}

}
