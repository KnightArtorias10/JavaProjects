package PokemonGame;

public class Main {

	public static void main(String[] args) {
		
		//Two pokemon fight, one wins and levels up, nomal fight test
		Pokemon charmander = new Pokemon("Charmander", Type.FIRE, new Attack("Scratch", 30, 100, 30, Type.NORMAL), 50, 50, 30, 60, 55, 58, 5, 200, 200);
		Pokemon squirtle = new Pokemon("Squirtle", Type.WATER, new Attack("Tackle", 40, 90, 25, Type.NORMAL), 50, 35, 60, 55, 60, 30, 5, 200, 200);
		charmander.attack(squirtle, charmander.getAttack1());
		System.out.println("Squirtle's HP: "+squirtle.getCurrentHP());
		charmander.attack(squirtle, charmander.getAttack1());
		System.out.println("Squirlte's HP: " +squirtle.getCurrentHP());
		charmander.attack(squirtle, charmander.getAttack1());
	}
}