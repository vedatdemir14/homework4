package characters;

public class Bow extends Weapon {
 // Constructor
 public Bow() {
     super();
 }

 @Override
 public double attack1Rate() {
	 return 0.8;
 }

 @Override
 public double attack2Rate() {
	 return 2.5;
 }
}
