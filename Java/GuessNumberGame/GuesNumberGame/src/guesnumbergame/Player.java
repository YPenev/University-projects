/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guesnumbergame;

import static guesnumbergame.GuesNumberGame.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Penev
 */
public abstract class Player implements Runnable {

    private Thread thread;
    protected String name;
    protected int accuracy = 0;
    protected int bestAnwer = MAX_SECRETNUMBERVALUE + 1;

    public Player(String name) {
        System.out.println("Creating " + this.name);
        this.name = name;
    }

    protected abstract int GuessNumber();

    public void Play() throws InterruptedException {
        while (!finishGame) {

            // Thread.sleep(this.accuracy);
            this.wait(this.accuracy);
            int guess = this.GuessNumber();
            usedNumbers.add(guess);
            System.out.println("Guessing: " + this.name);

            if (guess == secretNumber) {
                // add Winner to results
                results.add(this.name + " WINNER");

                finishGame = true;
                return;
            } else {
                this.accuracy = Math.abs(secretNumber - guess);

                if (this.accuracy < this.bestAnwer) {
                    this.bestAnwer = this.accuracy;
                }
            }
        }

        //add bestAnswer to results
        results.add(this.name + " - " + bestAnwer);
    }

    public void run() {

        try {
            this.Play();
        } catch (InterruptedException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Running " + this.name);

    }

    public void start() {
        System.out.println("Starting " + this.name);
        if (thread == null) {
            thread = new Thread(this, this.name);
            thread.start();
        }
    }
}
