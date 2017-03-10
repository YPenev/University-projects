/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guesnumbergame;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Penev
 */
public class GuesNumberGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int n = 1; //TODO insert

        PlayerFactory playerFactory = new PlayerFactory();

        // Init
        for (int i = 0; i < n; i++) {
            int rand = ThreadLocalRandom.current().nextInt(1, 5);
            
            Player randomPlayer = playerFactory.getPlayer(rand);
            
            //TODO: add player to list
        }

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
