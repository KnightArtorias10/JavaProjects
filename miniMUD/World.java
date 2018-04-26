package miniMUD;
/*
 * World class, a world consists of fields that can contain items. The player moves in the world.
 * Used as an abstract class that can be extended to have some sample worlds.
 */
import java.util.List;

public abstract class World {
	private List<Field> _fields;
	private Player _p;
	
	public World(List<Field> fields) {
		_fields = fields;
	}
	
	/**
	 * Adds a field to the world
	 * @param f
	 * @return
	 */
	public boolean addField(Field f) {
		if(!_fields.contains(f)) {
			_fields.add(f);
			return true;
		}
		return false;
	}
	
	//Getters and setters
	public List<Field> getFields() {
		return _fields;
	}
	
	public Player getPlayer() {
		return _p;
	}
}
