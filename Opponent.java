import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Opponent <T>{
    private static int opponentId;
    private static int points;
    private static int attack;
    private static int speed;
    private static int attackFactor;
    private static String opponentType;

    public Opponent(int opponentId, int points, int attack, int speed, String opponentType, int attackFactor){
        this.opponentId = opponentId;
        this.points = points;
        this.attack = attack;
        this.speed = speed;
        this.opponentType = opponentType;
        this.attackFactor = attackFactor;
    }

    public void attack(){
        // Bura yazılcak ama nasıl ?
        System.out.println("Opponent attacked!");
    }
    public void defend(){
       // Bura turn e göre olcak ama nasıl ?

        System.out.println("Opponent defended!");
    }
    public void special(){
        System.out.println("Opponent used special ability!");
        if(Objects.equals(opponentType, "Slime")) {
            Slime.useAbsorb();
        }
        if(Objects.equals(opponentType, "Orc")) {
            Orc.useHeavyHit();
        }
        if (Objects.equals(opponentType, "Goblin")){
            Goblin.useRushingStrike();
        }
        if (Objects.equals(opponentType, "Wolf")){
            Wolf.useCallFriends();
        }
    }





    public static int getOpponentId() {
        return opponentId;
    }
    public void setOpponentId(int opponentId){
        Random rand = new Random();
        opponentId = rand.nextInt(1, 4);
        Opponent.opponentId = opponentId;
    }

    public static int getPoints(){
        return points;
    }
    public static void  setPoints(int points){
        Opponent.points = points;
    }
    public static int getAttack(){
        return attack;
    }
    public  void  setAttack(int attack){
        this.attack = attack;
    }
    public static int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }
    public static String getOpponentType(){
        return opponentType;
    }
    public void setOpponentType(String opponentType){
        this.opponentType = opponentType;
    }

    public static int getAttackFactor(){
        return attackFactor;
    }
    public static void setAttackFactor(int attackFactor){
        Opponent.attackFactor = attackFactor;
    }

    static ArrayList<Opponent> opponents = new ArrayList<Opponent>();
    public static void addOpponent(Opponent opponent){
        opponents.add(opponent);
    }
    public void removeOpponent(Opponent opponent){
        opponents.remove(opponent);
    }
    public ArrayList<Opponent> getOpponents(){
        return opponents;
    }
    public Opponent<T> cloneOpponent() throws CloneNotSupportedException {
        return (Opponent<T>) super.clone();
    }


