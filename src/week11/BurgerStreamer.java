package week11;

import java.util.stream.Collectors;

public class BurgerStreamer {

	public static void main(String[] args) {
		new BurgerStreamer().run();
	}

	private void run() {
		String names = Burger.getBurgers() 			// @formatter:off
			.stream()								// Stream of Burger
			.map(b -> b.toString()) 				//Stream of String (name)
			.sorted() 								//Sort by name (ascending)
			.collect(Collectors.joining(", "));		//Turn into String comma separated
		// @formatter:on
		System.out.println(names);
	}

}
