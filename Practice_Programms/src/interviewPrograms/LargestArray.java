package interviewPrograms;

import java.io.IOException;

import org.omg.SendingContext.RunTime;

public class LargestArray {

	public static void main(String[] args) {
		int[] arr = {-20,30,40,50,60};
		int lnumber = arr[0];
		int snumber = arr[0];
		int index = 0;
		for(int i=0;i<arr.length;i++) {
			if(lnumber<arr[i]) {
				lnumber = arr[i];
				index = i;
			}
			if(snumber>lnumber) {
				snumber = arr[i];
			}
			
		}
		// return arr[lnumber-1];
    System.out.println(lnumber );
    System.out.println(index);
   // System.out.println(snumber);
    
    try {
		Runtime.getRuntime().exec("");
	} catch (IOException e) {
		e.printStackTrace();
	}
	}

}
