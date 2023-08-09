package may19;

public class Stringreverse {

	public static void main(String[] args) {
		String s = "@@@@@@#$%& java ############ selenium @@@@@@ testing";
		String s1 = "9866963515SELENIUMtestingjava %%$$$###^^^&&&";
		String s2 = "\"678 $56 hyj\" ";
		
		s = s.replaceAll("[^!-*A-Z0-9]", "" );
		System.out.println(s);
		
		s1 = s1.replaceAll("[^a-z0-9]", "" );
		System.out.println(s1);
		
		s2 = s2.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s2);
		s2.split(s2, 678);
		
		//public class CharacterDemo {
			 //  public static void main(String[] args) {
				   String str = "AbCdEfGhIsssss";
				   String st= str.replaceAll("[^a-z]", "");
				   int count = 0;
				   for(int i = 0; i < str.length(); i++) {
				      char ch = str.charAt(i);
				      if(Character.isUpperCase(ch)) {
				         System.out.println(ch + " is an Uppercase Letter");
				         count = count + 1;
				      }else
				      {
				    	  System.out.println("No upper cases");
				    	  
				      }
			      }
				   System.out.println(st);
				   
				   //if(count == 0)
					 //  System.out.println("No Uppercase Letters in the String");
			   }
			

	}

/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *
 */


















