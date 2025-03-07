package Practice;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=575;
		int temp=a;
		int rev=0;
		
		while(a>0)
		{
			rev=a%10+(rev*10);
			a=a/10;
			
			
		}
		System.out.println(rev==temp?"Number is pallindrome":"Number is not pallindrome");
		
	}

}
