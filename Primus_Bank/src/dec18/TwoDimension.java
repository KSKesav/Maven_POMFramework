package dec18;

public class TwoDimension {

	public static void main(String[] args) {
		//store table data to array
		String login [][] = new String[4][2];
		login [0][0] = "Admin1";
		login [0][1] = "Test1";
		login [1][0] = "Admin2";
		login [1][1] = "Test2";
		login [2][0] = "Admin3";
		login [2][1] = "Test3";
		login [3][0] = "Admin4";
		login [3][1] = "Test4";
		System.out.println(login [3][1]);
		//iterate all rows
		for (int i=0; i<login.length;i++)
		{
			//iterate all columns in each row
			for (int j=0; j<login[i].length; j++)
			{
				System.out.println(login[i][j]+"\t");	
			}
			System.out.println();
		}

	}

}
