package dec15;

public class Comparision {

	public static void main(String[] args) {
		int a=100, b= 200, c=100;
		System.out.println(a==c);
		System.out.println(a==b);
		System.out.println(a!=c);
		System.out.println(a!=b);
		System.out.println(a==c && c!=b);
		System.out.println(a==b && c!=b);
		System.out.println(a==c || b!=c);
		System.out.println(a!=c || b==c);
		System.out.println(a==c || b==c);
		System.out.println(!(a==c));
		System.out.println((a!=c));
		

	}

}
