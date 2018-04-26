package Trolley;

public class Trolley {
	private Product[] _loadedProducts;
	private int _capacity;
	private int _currentSize;
	private Cell _current;
	
	public Trolley(int capacity) {
		_capacity = capacity;
		_loadedProducts = new Product[_capacity];
		_currentSize = 0;
	}
	
	/**
	 * Checks whether the move is legal and moves the trolley to the desired direction
	 * @param dir
	 */
	public void move(Direction dir) {
		switch(dir) {
		case WEST: if(_current.getWest() != null) { _current = _current.getWest(); break; }
		case NORTH: if(_current.getNorth() != null) { _current = _current.getNorth(); break; }
		case EAST: if(_current.getEast() != null) { _current = _current.getEast(); break; }
		case SOUTH: if(_current.getSouth() != null) { _current = _current.getSouth(); break; }
		}
	}
	
	/**
	 * If _currentSize is at the beginning of the container, there are no products in it.
	 * @return
	 */
	public boolean isEmpty() {
		return _currentSize == 0;
	}
	
	/**
	 * If _currentSize reaches the capacity of the container, it is full.
	 * @return
	 */
	public boolean isFull() {
		return _currentSize == _capacity;
	}
	
	/**
	 * Adds a new product to the top of the container.
	 * @param p
	 * @return
	 */
	public boolean load(Product p) {
		if(!isFull()) {
			_loadedProducts[_currentSize] = p;
			_currentSize++;
			return true;
		}
		return false;
	}
	
	/**
	 * Removes the product at the top of the container.
	 * @return
	 */
	public Product unload() {
		return _loadedProducts[_currentSize--];
	}
	
	/**
	 * Removes all the products from the container.
	 * @return
	 */
	public Product unloadAll() {
		return _loadedProducts[_currentSize = 0];
	}
}
