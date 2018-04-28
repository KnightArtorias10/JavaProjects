package PokemonGame;

public class Attack {
	private String _name;
	private int _strength;
	private int _accuracy;
	private int _attackPoints;
	private int _currentAttackPoints;
	private Type _element;
	
	public Attack(String name, int strength, int accuracy, int attackPoints, Type element) {
		_name = name;
		_strength = strength;
		_accuracy = accuracy;
		_attackPoints = attackPoints;
		_currentAttackPoints = _attackPoints;
		_element = element;
	}
	
	//Getters and setters
	public String getName() {
		return _name;
	}
	
	public int getStrength() {
		return _strength;
	}
	
	public int getAccuracy() {
		return _accuracy;
	}
	
	public int getAttackPoints() {
		return _attackPoints;
	}
	
	public int getCurrentAttackPoints() {
		return _currentAttackPoints;
	}
	
	public Type getElement() {
		return _element;
	}
	
	public void setCurrentAttackPoints(int currentAttackPoints) {
		_currentAttackPoints = currentAttackPoints;
	}
}
