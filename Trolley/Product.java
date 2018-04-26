package Trolley;
/*
 * Product that has attributes and can be loaded on the trolley
 */
public class Product {
	private String _name;
	private String _description;
	private int _size;
	
	public Product(String name, String description, int size) {
		
	}
	
	// Getters and setters
	public String getName() {
		return _name;
	}
	
	public String getDescription() {
		return _description;
	}
	
	public int getSize() {
		return _size;
	}
}
