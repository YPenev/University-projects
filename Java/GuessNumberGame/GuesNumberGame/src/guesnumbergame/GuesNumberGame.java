/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guesnumbergame;

/**
 *
 * @author Penev
 */
public class GuesNumberGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
