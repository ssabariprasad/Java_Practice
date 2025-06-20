package Practice;

public class RangeOfPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int n=10;
		for(int i=1;i<=n;i++)
		{
		   if(isPrime(i))
		   {
			   System.out.println(i);
		   }
		}
		
	}
	public static boolean isPrime(int a) {
		if(a<=1)
		{
			return false;
		}
		for(int i=2;i<=Math.sqrt(a);i++)
			{
				if(a%i==0)
				{
					return false;
				}
			}
		return true;
		}
}
