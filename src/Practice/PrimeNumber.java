package Practice;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int b=5;
  System.out.println(isPrime(b)? "Number is prime number:"+b : "Number is not a prime number:"+b);
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

