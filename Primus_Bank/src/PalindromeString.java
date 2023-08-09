import java.util.Scanner;

public class PalindromeString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String");
	String str = sc.next();
	//String str = "MaDaM";
	String org_str = str;
	String rev="";
	int len = str.length();
	for(int i=len-1;i>=0;i--)
	{
		rev = rev+str.charAt(i);
	}
	if(org_str.equalsIgnoreCase(rev))
	{
		System.out.println(org_str+ " is Palindrome Stirng     ");
	}
	else
	{
		System.out.println(org_str+ " is not Palindrome Stirng     ");
	}
}
}
