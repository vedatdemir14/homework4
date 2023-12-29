package characters;
import java.util.Random;

public class Sword extends Weapon {
 public Sword() {
	 super();
 }

 public  double attack1Rate() {
    return 1;
 }

 public double attack2Rate() {
     if (new Random().nextDouble() <= 0.25) {
    	 System.out.print("Attack is failed.");
    	 return 0;
     } else {
         return 2;
     }
 }
}
