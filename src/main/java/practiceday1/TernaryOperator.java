package practiceday1;

public class TernaryOperator {

	public static void main(String[] args) {
		
		int a=100, b=200;
		int x=a<b?a:b;
		//System.out.println(x);
		a=1000;
		b=2000;
		x=b<a?b:a;
		System.out.println(x);
		x=(1==1)?a:b;
		System.out.println(x);
		
		int age=15;
		String res=age>=18?"eligible for vote":"not eligible for vote";
		System.out.println(res);
		

	}

}
