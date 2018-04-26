package miniMUD;
/*
 * Door class. A door is closed unless the player has a key to open it.
 */
public class Door extends Field {

	/**
	 * Constructor 
	 */
	public Door() {
		super("A door... you can unlock it with a key", false);
	}
	
	/**
	 * Unlocks a door by making it enterable
	 */
	public void unlock() {
		setIsEnterable(true);
	}
}
