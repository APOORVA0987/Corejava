package in.com.exersize;

public class SumCountDivisibleBy7 {

	public static void main(String[] args) {
		
		int sum =0,count=0;
		
		for(int i=101; i<200; i++){
			if(i%7==0)
			{
			sum=sum+i;
			count++;
			}
			
		}
		System.out.print("sum of "+ sum+" " +"total num"+" "+count); 
		
	} 
}
