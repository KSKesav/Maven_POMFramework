package interviewPrograms;

import java.util.Arrays;

public class Strings {

	public static void main(String[] args) {
	String s1 = "asd esf abc";
	String s2 = "shiva";
	String s3 = "hello world im shiva kesav automation testing ";
	System.out.println(s1.substring(4, 8));
	System.out.println(s2.replace("i", ""));
    System.out.println(Arrays.toString(s3.split(" ")));
    System.out.println(s3.substring(6, 11));
    
    
    //Repeated count 
    String s4="Hello world";
    String s5=s4.replace("l","");
    System.out.println(s4);
    System.out.println(s5);
    System.out.println(s4.length()-s5.length());
    /*char[] a= s.toCharArray();
    System.out.println(a.count());*/
    
    // 
    String s6="Steve";
    String s7="Jobs";
    System.out.println(s6+" "+s7.charAt(0));
    System.out.println(s7+","+s6.substring(0,1));
    
    
    //largest word
    String s8="hello how r u awesome";
    String s9[]=s8.split("\\s");
    int max=s9[0].length();
    String s10="";
    for(int i=0;i<s9.length;i++)
    {
        if(s9[i].length()==max)
        {
          //  max=max;
            s10=s9[0];
        }
        else if(s9[i].length()>max)
        {
            max=s9[i].length();
            s10=s9[i];
        }
        
    }
    System.out.println(s10);
   
}
    
    

	}


