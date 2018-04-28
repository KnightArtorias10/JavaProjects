package PokemonGame;

public class Pokemon {
	private String _name;
	private Type _type1, _type2;
	private Attack _attack1, _attack2, _attack3, _attack4;
	
	//Stats
	final int MAX_LEVEL = 100;
	private int _maxHP;
	private int _currentHP;
	private int _attack, _defense, _specialAttack, _specialDefense, _speed;
	
	//Level
	private int _level;
	private int _neededXP;
	private int _currentXP;
	private int _worthXP;//The xp you gain when defeating 
	
	public Pokemon(String name, Type type, Attack attack1, int maxHP, int attack, int defense, int specialAttack, int specialDefense, int speed, int level, int neededXP, int worthXP) {
		_name = name;
		_type1 = type;
		_attack1 = attack1;
		_maxHP = maxHP;
		_attack = attack;
		_defense = defense;
		_specialAttack = specialAttack;
		_specialDefense = specialDefense;
		_speed = speed;
		_currentHP = _maxHP;
		_level = level;
		_currentXP = neededXP;
		_currentXP = 0;
		_worthXP = worthXP;
	}
	
	public Pokemon(String name, Type type1, Type type2, Attack attack1, int maxHP, int attack, int defense, int specialAttack, int specialDefense, int speed, int level, int neededXP, int worthXP) {
		_name = name;
		_type1 = type1;
		_type2 = type2;
		_attack1 = attack1;
		_maxHP = maxHP;
		_attack = attack;
		_defense = defense;
		_specialAttack = specialAttack;
		_specialDefense = specialDefense;
		_speed = speed;
		_currentHP = _maxHP;
		_level = level;
		_neededXP = neededXP;
		_currentXP = 0;
		_worthXP = worthXP;
	}
	
	/**
	 * Attack an enemy pokemon with an attack when the selected attack has attack points left
	 * TODO: Chech: effective, not effective, immune, weaknesses, difference between physical and special,
	 * check whether attack has same type as user
	 * @param p
	 * @param a
	 */
	public void attack(Pokemon p, Attack a) {
		if(a.getCurrentAttackPoints() > 0) {
			a.setCurrentAttackPoints(a.getCurrentAttackPoints()-1);
			System.out.println(_name + " used " +a.getName());
			p.setCurrentHP(p.getCurrentHP() - (a.getStrength() + _attack - p.getDefense()));
			
			if(p.getCurrentHP() <= 0) {
				System.out.println(p.getName() + " was defeated. " +_name + " got " +p.getWorthXP() +" xp.");
				levelUp();
			}
		}
	}
	
	/**
	 * Level up if the needed XP are reached
	 */
	public void levelUp() {
		if(_currentXP >= _neededXP) {
			_level++;
			System.out.println(_name + " grew to level " +_level);
			_neededXP = _neededXP*2;
			updateStats(3, 2, 1, 5, 2, 4);
		}
	}
	
	public void updateStats(int newHP, int newAtk, int newDef, int newSpAtk, int newSpDef, int newSpe) {
		_maxHP = _maxHP +newHP;
		_currentHP = _maxHP;
		_attack = _attack + newAtk;
		_defense = _defense + newDef;
		_specialAttack = _specialAttack + newSpAtk;
		_specialDefense = _specialDefense + newSpDef;
		_speed = _speed + newSpe;
		
		System.out.println("HP: +" +newHP);
		System.out.println("Attack: +" +newAtk);
		System.out.println("Defense: +" +newDef);
		System.out.println("Special attack: +" +newSpAtk);
		System.out.println("Special defense: +" +newSpDef);
		System.out.println("Speed: +" +newSpe);
	}
	//Getters and setters
	public String getName() {
		return _name;
	}
	
	public Attack getAttack1() {
		return _attack1;
	}
	
	public Attack getAttack2() {
		return _attack2;
	}
	
	public Attack getAttack3() {
		return _attack3;
	}
	
	public Attack getAttack4() {
		return _attack4;
	}
	
	public int getMaxHP() {
		return _maxHP;
	}
	
	public int getAttack() {
		return _attack;
	}
	
	public int getDefense() {
		return _defense;
	}
	
	public int getSpecialAttack() {
		return _specialAttack;
	}
	
	public int getSpecialDefense() {
		return _specialDefense;
	}
	
	public int getSpeed() {
		return _speed;
	}
	
	public int getCurrentHP() {
		return _currentHP;
	}
	
	public int getWorthXP() {
		return _worthXP;
	}
	
	public void setCurrentHP(int currentHP) {
		_currentHP = currentHP;
	}
}
