package Practice;


public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num=155;
    int temp=num;
    int len=String.valueOf(num).length();
    int sum=0;
   while(num>0)
    {  int digit=(num%10);
    	sum=(int) (sum+Math.pow(digit,len)); 
    	num=num/10;
    }
		
     System.out.println(sum==temp? "Number is Armstrong number:"+sum :"Number is not Armstrong number:"+sum);
		
		
	}

}
