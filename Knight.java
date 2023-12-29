package heroes;
import java.util.Random;

import Weapons.Weapon; 
public class Knight<T> extends Human<T> {
	
	public Knight(String name, Weapon weapon) {
		super(name, weapon);
		// TODO Auto-generated constructor stub
	}
	public void specialAction(Opponent<T> op) {
		checkSpecialUsed();
		setAfNextTurn(3);
		endTurn();
	}
}
