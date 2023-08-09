
public class Swapping2Numbers {
 public static void main(String[] args) {
	 int a = 10;
	 int b= 20;
	 System.out.println("Before swapping values are..."+a+"    "+b);
	 // logic 1 - Third variable
	/* int t=a;
	 a=b;
	 b=t;*/
	 //logic 2 without use of third variable
	/* a=a*b;  //10*20=200
	 b=a/b;  //200/20=10
	 a=a/b;  //200/10=20 */
	 
	 //logic 3 use +&- 
	 a=a+b; //10+20=30
	 b=a-b;  //30-20=10
	 a=a-b;  //30-10=20
	 System.out.println("After swapping values are..."+a+"    "+b);
}
}
