package characters;
import java.util.Random;
public abstract class Weapon {

	private  int additionalAttackBonus;
	//Constructor
	 public Weapon() {
	        this.setAdditionalAttackBonus(new Random().nextInt(11) + 10); // Range: 10 to 20
	    }
	public  int getAdditionalAttackBonus() {
		return additionalAttackBonus;
	}
	public abstract double attack1Rate();
	
	public  abstract double attack2Rate();
	public void setAdditionalAttackBonus(int additionalAttackBonus) {
		this.additionalAttackBonus = additionalAttackBonus;
	}

}
