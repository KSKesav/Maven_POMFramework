package interviewPrograms;

public class SumandAvgArray {

	public static void main(String[] args) {
		int i[] = new int[] {2,5,3,9,6};
		 int sum = 0;
		 int avg =0;
		 
				
		for(int j=0;j<i.length;j++) {
			
			sum = sum+i[j];
			avg=sum/i.length;
			}	
		System.out.println(sum);
		System.out.println(avg);
		
		
		for(int k=0; k<=5; k++) {
			for(int j=0; j<=k; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
