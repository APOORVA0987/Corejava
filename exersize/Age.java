package in.com.rays.exersize;

import java.time.LocalDate;
import java.time.Period;

public class Age {
	public static void main(String[] args) {
		
		LocalDate today =  LocalDate.now();
		
		LocalDate Dob = LocalDate.of(2003, 07, 03);
		
		Period Diff = Period.between( today, Dob);
		System.out.println(Diff);

}
}