package mock_qjspider;

public class Odddigits {
	public static void main(String[] args) {
		int num=125,rem=0,sum=0;
		while(num>0) {
			rem=num%10;
			if(rem%2==1) 
				sum=sum+rem*rem*rem;
			
			num=num/10;
		}
			System.out.println( "the sum of cubes numbers is :"+sum);
		
		}
	
}
					


