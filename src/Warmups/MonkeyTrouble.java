package Warmups;

import java.util.Scanner;

public class MonkeyTrouble {

    public static void main(String[] args) {

        //Setting up for another warmup
        boolean aSmile;
        boolean bSmile;


        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Monkey Trouble\n");

        System.out.print("We have two Monkeys\n");

        System.out.print("Is the first Monkey Smiling? (true / false)");
        aSmile = input.nextBoolean();

        System.out.print("Is the second Monkey Smiling? (true / false)");
        bSmile = input.nextBoolean();

        if(aSmile == bSmile){
            System.out.println("We are in trouble");
        } else {
            System.out.println("We are NOT in trouble");
        }


    }

}

