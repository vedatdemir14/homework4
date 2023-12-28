package heroes;


public abstract class Human <T>{
    private String name;
    private int points;
    private int stamina;
    private int attack;
    private int speed;
    private int attackFactor;
    

    public Human(String name, int points, int attack, int speed){
        this.name = name;
        this.points = points;
        this.stamina = 10;
        this.attack = attack;
        this.speed = speed;
        this.attackFactor = 1;
    }

    public void attack(){
        
        System.out.println("Opponent attacked!");
    }
    public void defend(){
        

        System.out.println("Opponent defended!");
    }
    
    public void special(){
    }


    public String getName() {
        return name;
    }

    public int getPoints(){
        return points;
    }
    public void  setPoints(int points){
        this.points = points;
    }
    public int getAttack(){
        return attack;
    }
    public  void setAttack(int attack){
        this.attack = attack;
    }
    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int getStamina(){
        return stamina;
    }
    public void setStamina(int stamina){
        this.stamina = stamina;
    }

    public int getAttackFactor(){
        return attackFactor;
    }
    public void setAttackFactor(int attackFactor){
        this.attackFactor = attackFactor;
    }

    
}
