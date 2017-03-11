/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guesnumbergame;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Penev
 */
public class GuesNumberGame {

    public static final int MIN_SECRETNUMBERVALUE = 100;
    public static final int MAX_SECRETNUMBERVALUE = 999;

    public static boolean finishGame = false;
    public static int secretNumber;
    public static List<String> results = new ArrayList<String>();
    public static HashSet<Integer> usedNumbers = new HashSet<Integer>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PlayerFactory playerFactory = new PlayerFactory();
        Player[] players = new Player[n];

        // Init
        for (int i = 0; i < n; i++) {
            int rand = ThreadLocalRandom.current().nextInt(1, 5);

            players[i] = playerFactory.getPlayer("Player No:" + i, rand);
        }

        for (int i = 0; i < n; i++) {

            //TODO: arrayOfPlayer[i].Guess
        }

        // Print result
        System.out.println("Hello, World!");
        System.out.println("Sq gi pochnah");

        new Thread(new Runnable() {
            public void run() {

                for (int i = 0; i < 100000; i++) {
                }

                System.out.println("ThreadOne");

            }
        }).start();

        new Thread(() -> {
            System.out.println("ThreadTwo");
        }).start();

    }
}
