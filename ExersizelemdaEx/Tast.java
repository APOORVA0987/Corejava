package in.com.rays.ExersizelemdaEx;

public class Tast {
	
	public static void main(String[] args) {
//harmonic
ex4_14 e=() ->{
	System.out.println(1);
	for(int i=0;i<10;i++) {
		System.out.print(1+"/"+i+"+");
	}
};
//revarse	
ex4_14 s=() ->{
	
	int a=1234;
	while(a>0) {
		int i= a%10;
		System.out.print(i);
		a=a/10;
	}
	
};

//fabo
ex4_14 f=() ->{
	
	int a=0;int b=1;
	System.out.println(a+""+b);
	int c;
	
	for(int i=1;i<=10;i++) {
		c=a+b;
		System.out.println(""+c);
	
	a=b;
	b=c;
	}
	
};f.harmonic();
		
	}

}
