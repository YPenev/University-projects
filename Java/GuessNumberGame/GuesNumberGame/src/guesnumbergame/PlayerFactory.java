/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guesnumbergame;

import guesnumbergame.Players.*;

/**
 * FACTORY DESIGN PATTERN
 *
 * @author Penev
 */
public class PlayerFactory {

    public Player getPlayer(String name, int playerType) {
        
       String nameWithTactic = "(T" + playerType + ") " + name;

        switch (playerType) {
            case 1:
                return new PlayerTypeOne(nameWithTactic);
            case 2:
                return new PlayerTypeTwo(nameWithTactic);
            case 3:
                return new PlayerTypeThree(nameWithTactic);
            case 4:
                return new PlayerTypeFour(nameWithTactic);
            default:
                break;
        }

        return null;
    }
}
