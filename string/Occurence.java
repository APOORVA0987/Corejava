package in.com.rays.string;

public class Occurence {
public static void main(String[] args) {
	String s1="Apurva gurjar";
	String s=s1.toLowerCase();
int t=0;
	for(char a='a';a<'z';a++) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==a) {
				t++;
				}
			
			
		}
		if(t!=0)
			System.out.println(a+"="+t);t=0;
		
		
		
	}
}
}
