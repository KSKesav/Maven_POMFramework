package interviewPrograms;

import java.util.Arrays;



public class MergeArrays {

	public static void main(String[] args) {
		
		int[] farray = {10,20,30,40};
		int [] sarray = {88,66,99,33};
		int fa = farray.length;
		int sa= sarray.length;
		int [] result = new int[fa+sa];
		
		for(int i=0; i<fa;i++) {
			result[i] = farray[i];
		}
		for(int i=0;i<sa;i++) {
			result[i+fa] = sarray[i];
		}
		//System.arraycopy(farray, 0, result, 0,fa);
		//System.arraycopy(sarray, 0, result, fa, sa);
		System.out.println(Arrays.toString(result));
	}

}
