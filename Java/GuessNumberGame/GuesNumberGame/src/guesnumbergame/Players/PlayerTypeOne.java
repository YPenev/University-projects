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

    @Override
    public int Gues() {
        int answer =  ThreadLocalRandom.current().nextInt(100, 1000);

        return answer;
    }

}
