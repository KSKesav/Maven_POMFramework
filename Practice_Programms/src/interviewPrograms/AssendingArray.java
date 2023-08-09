package interviewPrograms;

import java.util.Arrays;

public class AssendingArray {

	public static void main(String[] args) {
		int[] a = {4,-9,-8,1,7};
		
		int n = a.length;
		
		for(int i = 0 ;i<n-1;i++) {
			for(int j =0;j<n-1;j++) {
				if(a[j]>a[j+1]) {
					int t = a[j];   //t=4
					a[j] = a[j+1];   //4=-9
					a[j+1] = t;      //-9=t
				}
			}
			
		}
    System.out.println(Arrays.toString(a));
	}

}
