package Practice;

public class PatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] row= {1,2,3,4,5,4,3,2,1};
	for(int n:row)
	{
		for(int i=1;i<=n;i++)
		{
		System.out.print("*");	
		}
		
		System.out.println();
	}

	}

}
