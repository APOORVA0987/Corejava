package in.com.rays.java8;

import java.util.Arrays;

public class TestParrel {
	
	
	 public static void main(String[] args) {
		 
	
		 int []arr = {9,3,6,8,4};
		 
	Arrays.parallelSort(arr);
	for (int i : arr) {
		System.out.println(i);
	}
	
	 }
}
