/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guesnumbergame.Players;

import guesnumbergame.Player;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Penev
 */
public class PlayerTypeTwo implements Player {

    private List<Integer> usedNumbers;

    public PlayerTypeTwo() {
        this.usedNumbers = new ArrayList<>();
    }

    @Override
    public int Gues() {

        int answer = 0;
        
        do {
            answer = ThreadLocalRandom.current().nextInt(100, 1000);
        } while (this.usedNumbers.contains(answer));

        this.usedNumbers.add(answer);

        return answer;
    }
}
