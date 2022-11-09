package in.com.rays.stringbuffer;

public class Buffer {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Vijay");
				
				sb.append("Dinanath chauhan");
				
				System.out.println("Length:"+ sb.length());
				System.out.println("Capacity:" + sb.capacity());
				System.out.println("Char at:"+sb. charAt(1));
				System.out.println("Index Of:"+ sb.indexOf("Dinanath"));
				System.out.println("Reverse: " + sb.reverse());
				
	}

}
