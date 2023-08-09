
public class Program {
	public static void main(String[] args) {
		int i;
		int j;
		for(i=1;i<=3;i++)
		{
			for(j=1;j<=4;j++)
			{
				if(i== 1 || i == 3|| j==1 || j== 4)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}
		
		
	}

}
