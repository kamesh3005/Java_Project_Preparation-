package practiceday6;

import java.util.Arrays;

public class AccountMain {

	public static void main(String[] args) {

		Account ac = new Account();
		ac.setAcc_Num(987001);
		ac.setName("kamesh");
		ac.setAmont(55790.89);
		System.out.println(ac.getAcc_Num());
		System.out.println(ac.getName());
		System.out.println(ac.getAmont());

		
	}

}
