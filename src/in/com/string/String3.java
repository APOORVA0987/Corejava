package in.com.string;

public class String3 {

	public static void main(String[] args) {
		
		String S="Vijay Dinanath Chauhan";
		System.out.println(S.length());
		System.out.println(S.charAt(6));
		System.out.println(S.indexOf("Dina"));
		System.out.println(S.indexOf("i"));
		System.out.println(S.lastIndexOf("i"));
		System.out.println(S.replace("a","b"));
		System.out.println(S.replaceAll("a","b"));
		System.out.println(S.toLowerCase());
		System.out.println(S.toUpperCase());
		
		System.out.println(S.startsWith("Vijay"));
		System.out.println(S.endsWith("han"));
		System.out.println(S.substring(6));
		
		
	}
	
	
}

