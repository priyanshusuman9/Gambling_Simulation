package com.bridgelabz;
import java.util.Random;

public class WonLooseFiftyPercentStake {
    /**
     * starting with a stake of $100 every day and bet $1 every game. Generate a
     * random in static As a Calculative Gambler if won or lost 50% of the stake,
     * would resign for the day
     */
    public static final int initialStake = 100;
    public static final int stakeBet = 1;
    public static final float percentage50 = (initialStake / 100) * 50;
    public static final float highestStake = percentage50 + initialStake;
    public static final float lowestStake = percentage50 - initialStake;

    static Random random = new Random();

    public static void main(String[] args) {

        int totalStake = initialStake;

        while (totalStake < highestStake && totalStake > lowestStake) {
            int play = random.nextInt(2); // generate random number in range 0,1

            switch (play) {

                case 0:
                    totalStake = totalStake - stakeBet;
                    System.out.println("Stake after loosing: " + totalStake); // print result
                    break;

                case 1:
                    totalStake = totalStake + stakeBet;
                    System.out.println("Stake after winning: " + totalStake);
                    break;
            }

        }
        // if will get the bet is won or lose
        if (totalStake == highestStake)
            System.out.println("Gambler won by: " + totalStake);
        else
            System.out.println("Gambler lost by: " + totalStake);
    }

}

