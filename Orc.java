import java.util.Random;

public class Orc <T> extends Opponent<T>{
    public Orc(int opponentId, int points, int attack, int speed, String opponentType, int attackFactor){
        super(opponentId, points, attack, speed, opponentType, attackFactor);

        setOpponentType("Orc");

        Random rand = new Random();
        setPoints(rand.nextInt(50, 150));

        setAttack(rand.nextInt(5, 25));

        setSpeed(rand.nextInt(1, 90));


    }

    private static void heavyHit(){
        int attackFactor = getAttackFactor();
        int new_attackFactor = attackFactor *2;
        setAttackFactor(new_attackFactor);
        System.out.println("Orc used heavy hit ability!");


    }
    public static void useHeavyHit(){
        heavyHit();
    }


}

