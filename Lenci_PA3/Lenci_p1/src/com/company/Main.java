package com.company;
import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static int questionGeneration(int difficulty, int type){
        Random rand = new SecureRandom();
        int rand1, rand2, ans;

        switch(difficulty){
            case 4:
                rand1 = rand.nextInt(10000);
                rand2 = rand.nextInt(10000);
                break;
            case 3:
                rand1 = rand.nextInt(1000);
                rand2 = rand.nextInt(1000);
                break;
            case 2:
                rand1 = rand.nextInt(100);
                rand2 = rand.nextInt(100);
                break;
            case 1:
            default:
                rand1 = rand.nextInt(10);
                rand2 = rand.nextInt(10);
                break;
        }

        if(type == 5){
            type = 1 + rand.nextInt(4);
        }
        switch(type){
            case 4:
                if(rand2 == 0){
                    rand2 = 1;
                }
                System.out.println("How much is " + rand1 + " divided by " + rand2 + "? (Round down)");
                ans = rand1 / rand2;
                break;
            case 3:
                System.out.println("How much is " + rand1 + " minus " + rand2 + "?");
                ans = rand1 - rand2;
                break;
            case 2:
                System.out.println("How much is " + rand1 + " times " + rand2 + "?");
                ans = rand1 * rand2;
                break;
            case 1:
            default:
                System.out.println("How much is " + rand1 + " plus " + rand2 + "?");
                ans = rand1 + rand2;
                break;
        }

        return ans;
    }

    public static String correctResponse(){
        Random rand = new SecureRandom();
        int randSelect = rand.nextInt(4);
        String retStr;

        switch(randSelect){
            case 3:
                retStr = "Very good!";
                break;
            case 2:
                retStr = "Excellent!";
                break;
            case 1:
                retStr = "Nice work!";
                break;
            case 0:
                retStr = "Keep up the good work!";
                break;
            default:
                retStr = "error, unintended rand in correctResponse!";
                break;
        }
        return retStr;
    }

    public static String incorrectResponse(){
        Random rand = new SecureRandom();
        int randSelect = rand.nextInt(4);
        String retStr;

        switch(randSelect){
            case 3:
                retStr = "No. Please try again.";
                break;
            case 2:
                retStr = "Wrong. Try once more.";
                break;
            case 1:
                retStr = "Don’t give up!";
                break;
            case 0:
                retStr = "No. Keep trying.";
                break;
            default:
                retStr = "error, unintended rand in incorrectResponse!";
                break;
        }
        return retStr;
    }

    public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);
            int guess, ans, correctCount, level, type;
            double percent;

            while(true) {
                System.out.println("Select arithmetic type (1-Addition 2-Multiplication 3-Subtraction 4-Division 5-Random)");
                type = scnr.nextInt();
                System.out.println("Select difficulty level (1-4)");
                level = scnr.nextInt();
            correctCount = 0;
            for (int i = 0; i < 10; ++i) {
                ans = questionGeneration(level, type);
                guess = scnr.nextInt();

                if (ans != guess) {
                    System.out.println(incorrectResponse());
                } else {
                    System.out.println(correctResponse());
                    correctCount++;
                }
            }
            percent = (double)correctCount * 10.00 /100.00;

            if (percent < .75) {
                System.out.println("Please ask your teacher for extra help.");
            } else {
                System.out.println("Congratulations, you are ready to go to the next level!");
            }
        }
    }
}
