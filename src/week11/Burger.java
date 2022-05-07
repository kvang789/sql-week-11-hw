/**
 * 
 */
package week11;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Promineo
 *
 */
public class Burger { //this is list of objects
	private String name;

	private static final List<Burger> burgers = List.of( // @formatter:off
			new Burger("Cheese"),
			new Burger("Mushroom"),
			new Burger("Blue Cheese"),
			new Burger("Bacon")	
			); // @formatter:on

	public Burger(String name) { //need a constructor for burger that will take a name and set it
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() { //1d
		return name + " Burger";
	}

	public int compare(Burger that) { 
		return this.name.compareTo(that.name);
	}

	public static List<Burger> getBurgers() {
		return new LinkedList<>(burgers);
	}
}
