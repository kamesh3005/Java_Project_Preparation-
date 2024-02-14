package practiceday1;

public class SwappingOfNumber {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("********************Swapping without variable****************");
		int a1=10;
		int b1=20;
		a1=a1+b1;//30
		b1=a1-b1;//10
		a1=a1-b1;//20
		System.out.println(a);
		System.out.println(b);
		
		
		//up casting 
		int x=10;
		double f=x;
		System.out.println(f);
		//down casting
		float t=10.34f;
		int n=(int)t;
		System.out.println(n);
		
		
		
	}

}
