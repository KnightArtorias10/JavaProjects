package Trolley;

public class Cell {
	private Cell _west, _north, _east, _south;
	
	public Cell() {
		
	}
	
	//Getters and setters
	public Cell getWest() {
		return _west;
	}
	
	public Cell getNorth() {
		return _north;
	}
	
	public Cell getEast() {
		return _east;
	}
	
	public Cell getSouth() {
		return _south;
	}
	
	public void setWest(Cell west) {
		_west = west;
	}
	
	public void setNorth(Cell north) {
		_north = north;
	}
	
	public void setEast(Cell east) {
		_east = east;
	}
	
	public void setSouth(Cell south) {
		_south = south;
	}
}
