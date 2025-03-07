package Practice;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int a=5;
		
for(int i=0;i<a;i++)
{
	System.out.print(fibonacci(i)+" ");
}

		
	}

	
	public static int fibonacci(int b)
	{
		if(b<=1)
		{
			return b;
		}
			return fibonacci(b-1)+fibonacci(b-2);
	}
}
