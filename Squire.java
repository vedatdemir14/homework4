package heroes;
import java.util.Random;
import java.util.Scanner;
import Weapons.Weapon; 
public class Squire<T> extends Human<T> {
	
	public Squire(String name, Weapon weapon) {
		super(name, weapon);
		
	}
	public void specialAction(Opponent<T> op) {
		checkSpecialUsed();
		setAttackFactor(0.5);
		setStamina(10);
		endTurn();
	}
	
}
