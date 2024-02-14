package practiceday5;

public class GreetingsMain {

	public static void main(String[] args) {
		Greetings gr = new Greetings();
		gr.greeting1();// Approach 1
		String str = gr.greeting2();// Approach 2
		// whenever we returning some value we want to create the separate variable
		System.out.println(str);
		System.out.println(gr.greeting2());
		gr.greeting3("Kamesh");
		int greeting4 = gr.greeting4(12, 5);
		System.out.println(greeting4);
		System.out.println(gr.greeting4(14, 13));

	}

}
