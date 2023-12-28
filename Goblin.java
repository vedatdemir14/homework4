import java.util.Random;
public class Goblin<T> extends Opponent<T> {

        public Goblin(int opponentId, int points, int attack, int speed, String opponentType, int attackFactor) {
            super(opponentId, points, attack, speed, opponentType, attackFactor);

            setOpponentType("Goblin");

            Random rand = new Random();
            setPoints(rand.nextInt(50, 150));

            setAttack(rand.nextInt(5, 25));

            setSpeed(rand.nextInt(1, 90));

        }

        private static void rushingStrike(){
            // bura yazılcak


        }
        public static void useRushingStrike(){
            rushingStrike();
        }

  
