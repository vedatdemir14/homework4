package heroes;
import java.util.Random;
import java.util.Scanner;
import Weapons.Weapon; 

public abstract class Human<T>{
    private String name;
    private double points;
    private int stamina;
    private double attack;
    private double speed;
    private double attackFactor;
    private double guardFactor;
    private Weapon weapon;
    protected boolean specialUsed = false;
    private int turnToPlay;
    private double afNextTurn; //attackFactor for next round
    

    public Human(String name, Weapon weapon){
    	Random ran = new Random();
        this.name = name;
        this.points = ran.nextInt(51) + 100;
        this.stamina = 10;
        this.attack = ran.nextInt(21) + 20;
        this.speed = ran.nextInt(90) + 10;
        this.attackFactor = 1;
        this.guardFactor = 1;
        this.turnToPlay = 0;
        this.weapon = weapon;
    }

    public void punch(Opponent<T> op){
        System.out.println("Warrior attacked!");
        this.stamina -= 1;
        double dealt = 0.8 * attack;
        op.setPoints(op.getPoints()-dealt);
        endTurn();
    }
    public void attackWithWeapon(Opponent<T> op, int attackType){
    	if (attackType == 1) {
    		double damage = weapon.attack1rate() * (((Weapon) weapon).getAdditionalAttackBonus()+this.attack);
    	};
    	endTurn();
    	
    	
    }
    public void guard(){
        setStamina(getStamina()+3);
        setGuardFactor(0.25);

        System.out.println("Hero defended!");
        endTurn();
    }
    public void run() {
    	System.out.println("Heroes have fleeded!");
    	System.exit(0);
    	
    }
    
    public void special(){
    	
    }


    public String getName() {
        return name;
    }
    public double getPoints(){
        return points;
    }
    public void  setPoints(double points){
        this.points = points;
    }
    public double getAttack(){
        return attack;
    }
    public  void setAttack(double attack){
        this.attack = attack;
    }
    public double getSpeed(){
        return speed;
    }
    public int getStamina(){
        return stamina;
    }
    public void setStamina(int stamina){
        this.stamina = stamina;
    }
    public double getAttackFactor(){
        return attackFactor;
    }
    public void setAttackFactor(double attackFactor){
        this.attackFactor = attackFactor;
    }
    public double getGuardFactor(){
        return attackFactor;
    }
    public void setGuardFactor(double attackFactor){
        this.attackFactor = attackFactor;
    }
    public void checkSpecialUsed() {
    	specialUsed = true;
    }
    public void endTurn() {
    	this.turnToPlay -= 1;
    }
    public void setAfNextTurn(double af) {
    	afNextTurn = af;
    }
    public void doubleNextTurn() {
    	turnToPlay += 1;
    }
    public void doNotPlayNextTurn() {
    	turnToPlay -= 1;
    }
}
