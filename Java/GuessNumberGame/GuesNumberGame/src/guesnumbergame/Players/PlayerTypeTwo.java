/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guesnumbergame.Players;

import static guesnumbergame.GuesNumberGame.*;
import guesnumbergame.Player;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Penev
 */
public class PlayerTypeTwo extends Player {

    private List<Integer> currentPlayerUsedNumbers;

    public PlayerTypeTwo(String name) {
        super(name);
        this.currentPlayerUsedNumbers = new ArrayList<>();
    }

    @Override
    protected int GuessNumber() {
        int answer = 0;

        do {
            answer = ThreadLocalRandom.current().nextInt(MIN_SECRETNUMBERVALUE, MAX_SECRETNUMBERVALUE + 1);
        } while (this.currentPlayerUsedNumbers.contains(answer));

        this.currentPlayerUsedNumbers.add(answer);

        return answer;
    }
}
