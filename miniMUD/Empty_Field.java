package miniMUD;
/*
 * Empty field class. An empty field is always enterable and
 */
public class Empty_Field extends Field {
	private Item _item;
	
	/**
	 * Constructor without item 
	 * @param description
	 * @param isEnterable
	 */
	public Empty_Field() {
		super("An empty field... May contain an item.", true);
	}
	
	/**
	 * Constructor with item
	 * @param description
	 * @param isEnterable
	 * @param item
	 */
	public Empty_Field(Item item) {
		super("An empty field... May contain an item.", true);
		_item = item;
	}
	
	//Getters and setters
	public Item getItem() {
		return _item;
	}
	
	/**
	 * Setter, usually used if a player adds an item and the field's item is null
	 * @param item
	 */
	public void setItem(Item item) {
		_item = item;
	}

}
