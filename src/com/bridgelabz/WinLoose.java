package com.bridgelabz;
import java.util.Random;

public class WinLoose {
    /**
     * starting with a stake of $100 every day and bet $1 every game. Generate a
     * random in static make $1 bet so either win or loose $1
     */

    public static final int initialStake = 100;
    public static final int stakeBet = 1;
    static Random random = new Random();

    public static void main(String[] args) {

        int totalStake = initialStake;

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
}