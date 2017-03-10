/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guesnumbergame.Players;

import guesnumbergame.Player;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Penev
 */
public class PlayerTypeOne implements Player {

    private String name;
    private int accuracy = 0;

    private int GuessNumber() {

      
        int answer = ThreadLocalRandom.current().nextInt(100, 1000);

        return answer;
    }

    public void Play() {
        while (!finishGame) {

              // Thread.Sleep(accuracy);
              
            int guess = this.GuessNumber();

            if (guess == secretNumber) {
                // add Winner to results
                // finishGame = true;
                return;
            } else {
                accuracy     = // MOD(secretNumber - answer);
            }
        }

        //add bestAnswer to results
    }

}
