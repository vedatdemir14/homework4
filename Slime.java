import java.util.Random;
public class Slime<T> extends Opponent<T>{

    public Slime(int opponentId, int points, int attack, int speed, String opponentType, int attackFactor) {
        super(opponentId, points, attack, speed, opponentType, attackFactor);

        setOpponentType("Slime");

        Random rand = new Random();
        setPoints(rand.nextInt(50, 150));

        setAttack(rand.nextInt(5, 25));

        setSpeed(rand.nextInt(1, 90));




    }

        private static void absorb(){

            int new_points = getPoints() + getAttack();
            setPoints(Math.min(new_points, 150));
            System.out.println("Slime used absorb ability!");
            System.out.println("Slime's points increased by " + getAttack() + " points!");

        }
        public static void useAbsorb(){
            absorb();
        }



    }
