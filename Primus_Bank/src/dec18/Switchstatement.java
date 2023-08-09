package dec18;

import java.util.Scanner;

public class Switchstatement {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		for (int i=1; i<=5;i++)
		{
			System.out.println("Enter your course");
			String course = Sc.next();
			switch(course.toUpperCase())
			{
			case "MANNUAL TESTING":
			    System.out.println("Welcome to Qedge::::"+course);
			break;
			case "SELENIUM":
			    System.out.println("Welcome to Qedge::::"+course);
			break;
			case "QTP":
				System.out.println("Welcome to Qedge::::"+course);
				break;
			case"JAVA":
				System.out.println("Welcome to Qedge::::"+course);
				break;
				default:
				System.out.println("We are sorry we don't have course::::"+course);
				break;
			
			}
			//Sc.close();
			
		}
		
		
	}

}

