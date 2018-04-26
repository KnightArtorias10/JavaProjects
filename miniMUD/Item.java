package miniMUD;
/*
 * Abstract class that describes an item
 */
public abstract class Item {
	private String _name;
	private String _description;
	
	public Item(String name, String description) {
		_name = name;
		_description = description;
	}
	
	//Getters and setters
	public String getName() {
		return _name;
	}
	
	public String getDescription() {
		return _description;
	}
}
