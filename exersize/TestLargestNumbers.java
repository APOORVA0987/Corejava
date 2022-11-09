package in.com.rays.exersize;

public class TestLargestNumbers {
	
	
	public static void main(String[] args) {
		
		int arr[] = {2,5,7,9};
		
		int c = arr[0];

				for(int i = 0;i<arr.length;i++) {
			
			if(arr[i]>c){
				
				c = arr[i];
				
			}
	
		

		}System.out.println(c);
		
	}

}
