/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guesnumbergame;

import static guesnumbergame.GuesNumberGame.*;

/**
 *
 * @author Penev
 */
public abstract class Player {

    protected String name;
    protected int accuracy = 0;

    public Player(String name){
        this.name = name;
    }
    
   protected  abstract int GuessNumber();

    public void Play() throws InterruptedException {
        while (!finishGame) {

            Thread.sleep(this.accuracy);
            int guess = this.GuessNumber();

            if (guess == secretNumber) {
                // add Winner to results
                finishGame = true;
                return;
            } else {
                this.accuracy = Math.abs(secretNumber - guess);
            }
        }
        
        //add bestAnswer to results
    }
}
