/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guesnumbergame.Players;

import static guesnumbergame.GuesNumberGame.*;
import guesnumbergame.Player;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Penev
 */
public class PlayerTypeOne extends Player {

    public PlayerTypeOne(String name) {
        super(name);
    }

    @Override
    protected int GuessNumber() {
        int answer = ThreadLocalRandom.current().nextInt(MIN_SECRETNUMBERVALUE, MAX_SECRETNUMBERVALUE + 1);

        return answer;
    }
}
