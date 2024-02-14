package practiceday1;

public class OperatoeDemo {


	public static void main(String[] args) {

		//Arithmetic operator + - * / %
		int a=10;
		int b=15;
		System.out.println("sum of a and b is:"+(a+b));
		System.out.println("diff of a and b is:"+(a-b));
		System.out.println("multy of a and b is:"+(a*b));
		System.out.println("div of a and b is:"+(a/b));
		System.out.println("modulo of a and b is:"+(a%b));

		//Relational operator > >= < <= != ==
		a=20;

		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a!=b);
		System.out.println(a>=b);
		System.out.println(a==b);
		
		//Logical Operator && || !
		
		boolean b1=10<20;//true
		boolean b2=10>15;//false
		System.out.println(b1||b2);//false
		
		
		//Increment/Decrement operator
		int j=10;
		int result=j++;
		System.out.println(result);
		System.out.println(j);
		
		int k=100;
		//int res=k--;
		int res=--k;
		System.out.println(res);
		System.out.println(k);
		
		//Assignment operator
		int c=10;
		//c=c+5;
		//c+=5;
		//c-=5;
		
		System.out.println(c);
		int x=5;
		//x*=2;
		x%=2;
		System.out.println(x);//10
			
		
		
		
		
		
		
		
		
	}

}
