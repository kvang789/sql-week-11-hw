/**
 * 
 */
package week11;

import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * @author Promineo
 *
 */
public class BurgerOptional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new BurgerOptional().run();
	}

	private void run() {
		Optional<Burger> value = Optional.of(new Burger("Hawaiian"));
		Burger burger = burgerMethod(value);
		System.out.println("I ordered a " + burger + ".");

		try {
			Optional<Burger> empty = Optional.empty();
			burgerMethod(empty);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private Burger burgerMethod(Optional<Burger> burgerOptional) {
		return burgerOptional.orElseThrow(
				() -> new NoSuchElementException("The burger does not exist."));
	}

}
