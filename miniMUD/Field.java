package miniMUD;

public abstract class Field {
	private String _description;
	private Field _west, _north, _east, _south;
	private boolean _isEnterable;
	private Item _item;
	
	public Field(String description, boolean isEnterable) {
		_description = description;
		_isEnterable = isEnterable;
	}
	
	public Field(String description, boolean isEnterable, Item item) {
		_description = description;
		_isEnterable = isEnterable;
		_item = item;
	}
	
	// Getters and setters
	public String getDescription() {
		return _description;
	}
	
	public Field getWest() {
		return _west;
	}
	
	public Field getNorth() {
		return _north;
	}
	
	public Field getEast() {
		return _east;
	}
	
	public Field getSouth() {
		return _south;
	}
	
	public Item getItem() {
		return _item;
	}
	
	// Checks whether the field is enterable or not
	public boolean isEnterable() {
		return _isEnterable;
	}
	
	public void setWest(Field west) {
		_west = west;
	}
	
	public void setNorth(Field north) {
		_north = north;
	}
	
	public void setEast(Field east) {
		_east = east;
	}
	
	public void setSouth(Field south) {
		_south =south;
	}
	
	public boolean getIsEnterable() {
		return _isEnterable;
	}
	
	public void setIsEnterable(boolean isEnterable) {
		_isEnterable = isEnterable;
	}
	
	public void setItem(Item item) {
		_item = item;
	}
	
	/**
	 * Shows the player all the neighbours of the current field
	 */
	public void printNeighbours() {
		if(_west != null) {
			System.out.println("West: " +_west.getDescription());
		}
		
		if(_north != null) {
			System.out.println("North: " +_north.getDescription());
		}
		
		if(_east != null) {
			System.out.println("East: " +_east.getDescription());
		}
		if(_south != null) {
			System.out.println("South: " +_south.getDescription());
		}
	}
}
