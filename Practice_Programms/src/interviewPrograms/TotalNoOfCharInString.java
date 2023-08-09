package interviewPrograms;

public class TotalNoOfCharInString {

	public static void main(String[] args) {
		  String s1="9866963515SELENIUMtestingjava %%$$$###^^^&&&\"";
		  //String s2 ="";
	        int uc=0;
	        int lc=0;
	        int dig=0;
	        int sc=0;
	        
	        for(int i=0;i<s1.length();i++)
	     
	        {
	        	char ch = s1.charAt(i);
	            if(Character.isUpperCase(ch))
	            {
	            	//System.out.println(uc);
	                uc++;
	            }
	            
	            else if(Character.isLowerCase(s1.charAt(i)))
	            {
	                lc++;
	            }
	            else if(Character.isDigit(s1.charAt(i)))
	            {
	                dig++;
	            }
	            else
	            {
	                sc++;
	            }
	        }
	        System.out.println("uc  ="+uc);
	        System.out.println("lc  ="+lc);
	        System.out.println("dig ="+dig);
	        System.out.println("sc  ="+sc);
	      

	}

}
