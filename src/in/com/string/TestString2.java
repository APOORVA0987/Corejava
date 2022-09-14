package in.com.string;

public class TestString2 {

	public static void main(String[] args) {
		
		String  S = " vijay Dinanath chauhan";
		//System.out.println (S.length());
		//System.out.println();
		String str1[]=S.split(" ");
		for(int i=str1.length-1;i>0;i--)
		{
			String str2=str1[i];
		
			System.out.print(str2);
		}
		
	}
}
