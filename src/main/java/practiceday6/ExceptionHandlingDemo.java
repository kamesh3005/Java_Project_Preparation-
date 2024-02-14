package practiceday6;

import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {

		System.out.println("Program is started");
		System.out.println("programe is progress....");
		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter the Number");
		//int num = sc.nextInt();

		String str = null;
		try {
			// System.out.println(100 / num);
			System.out.println(str.length());

		} catch (ArithmeticException e) {
			System.out.println("Enter the Valid input");

		} catch (NumberFormatException e) {
			System.out.println("Enter the Valid input");

		} catch (NullPointerException e) {
			System.out.println("NullPointerException");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter the Valid input");

		}catch(Exception e) {
			System.out.println();
			
			
		}
		System.out.println("Programe is sucessfull");
		System.out.println("end of the program");

	}

}
