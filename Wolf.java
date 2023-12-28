import java.util.Random;
public class Wolf <T> extends Opponent<T> implements Cloneable{
    private static Opponent clonedWolf;

    public Wolf(int opponentId, int points, int attack, int speed, String opponentType, int attackFactor) {
        super(opponentId, points, attack, speed, opponentType, attackFactor);

        setOpponentType("Wolf");

        Random rand = new Random();
        setPoints(rand.nextInt(50, 150));

        setAttack(rand.nextInt(5, 25));

        setSpeed(rand.nextInt(1, 90));

    }
    public static Wolf cloneWolf(){
        Wolf clonedWolf = null;
        clonedWolf.setOpponentId(getOpponentId());
        clonedWolf.setPoints(getPoints());
        clonedWolf.setAttack(getAttack());
        clonedWolf.setSpeed(getSpeed());
        clonedWolf.setOpponentType(getOpponentType());
        clonedWolf.setAttackFactor(getAttackFactor());
        return clonedWolf;
    }



    private static void callFriends(){
        Random rand = new Random();

        int probability = rand.nextInt(1, 5);

        if (probability == 1){
            addOpponent(clonedWolf);
            System.out.println("Wolf used call friends ability!");
            System.out.println("Wolf called 1 more wolves!");
        }
        else{
            System.out.println("Wolf used call friends ability!");
            System.out.println("It failed!");
        }


    }
    public static void useCallFriends(){
        callFriends();
    }
}

