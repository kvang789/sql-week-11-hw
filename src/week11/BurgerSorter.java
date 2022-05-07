/**
 * 
 */
package week11;

import java.util.List;

/**
 * @author Promineo
 *
 */
public class BurgerSorter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new BurgerSorter().run();
	}

	private void run() {
		boolean sortWithLambda = false;
		List<Burger> burgers;
		String name;

		//System.out.println("Original: " + Burger.getBurgers());

		if(sortWithLambda) {
			burgers = sortWithLambda(); //sorts list alphabetical 
			name = "Lambda: ";			
		}
		else {
			burgers = sortWithMethodReference();
			name = "Method: ";
		}

		System.out.println(name + burgers);
	}

	private List<Burger> sortWithMethodReference() {
		List<Burger> burgers = Burger.getBurgers();

		burgers.sort(Burger::compare);

		return burgers;
	}

	private List<Burger> sortWithLambda() {
		List<Burger> burgers = Burger.getBurgers(); //the list

		burgers.sort((b1, b2) -> b1.compare(b2)); //1e
		return burgers;
	}

}
