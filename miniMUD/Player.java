package miniMUD;
import java.util.ArrayList;
/*
 * Player class. A player moves around the world, picks up items and opens doors
 */
import java.util.List;

public class Player {
	private Field _current;
	private List<Item> _inventory;
	
	public Player(Field current) {
		_current = current;
		_inventory = new ArrayList<Item>();
	}
	
	/**
	 * Adds an item from the current field to the inventory
	 * @param f - the field whose item shall be added to the player's inventory
	 * @return true if added, false if the field doesn't contain an item
	 */
	public boolean addItem() {
		if(_current.getItem() != null) {
			_inventory.add(_current.getItem());
			System.out.println("You just picked up " +_current.getItem().getName());
			_current.setItem(null);
			return true;
		}
		return false;
	}
	
	/**
	 * Moves the player from his current field to one of its neighbour fields
	 * @param dir - The direction to move the player
	 */
	public void move(Direction dir) {
		switch(dir) {
		case WEST: if(_current.getWest().isEnterable() == true && _current.getWest() != null) { _current = _current.getWest(); break; }
		case NORTH: if(_current.getNorth().isEnterable() == true && _current.getNorth() != null) { _current = _current.getNorth(); break; }
		case EAST: if(_current.getEast().isEnterable() == true && _current.getEast() != null) { _current = _current.getEast(); break; }
		case SOUTH: if(_current.getSouth().isEnterable() == true && _current.getSouth() != null) { _current = _current.getSouth(); break; }
		}
		_current.printNeighbours();
	}
	
	/**
	 * Unlocks a door if the inventory contains a key. Removes the key after successfully opening it.
	 * @param d - The door to open
	 * @param k - The key used to open the target door
	 */
	public void unlockDoor(Door d, Key k) {
		if(_inventory.contains(k)) {
			d.unlock();
			_inventory.remove(k);
			System.out.println("Alright! The door is unlocked now. But... your key is broken as well...");
		}
	}
	
	//Getters and setters
	public Field getCurrent() {
		return _current;
	}
	
	public List getInventory() {
		return _inventory;
	}
}
