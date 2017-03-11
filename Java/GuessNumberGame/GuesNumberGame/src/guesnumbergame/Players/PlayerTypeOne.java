/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guesnumbergame.Players;

import guesnumbergame.Player;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Penev
 */
public class PlayerTypeOne extends Player {

    @Override
    protected int GuessNumber() {
        int answer = ThreadLocalRandom.current().nextInt(100, 1000);
        
        return answer;
    }
}
