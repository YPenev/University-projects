/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guesnumbergame.Players;

import static guesnumbergame.GuesNumberGame.MIN_SECRETNUMBERVALUE;
import guesnumbergame.Player;

/**
 *
 * @author Penev
 */
public class PlayerTypeFour extends Player {

    private static int counter;
    
    public PlayerTypeFour(String name) {
        super(name);
        
        this.counter = MIN_SECRETNUMBERVALUE;
    }

    @Override
    protected int GuessNumber() {
     
        return this.counter++;
    }
}
