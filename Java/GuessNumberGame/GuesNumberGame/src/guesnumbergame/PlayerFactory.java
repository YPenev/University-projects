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

        switch (playerType) {
            case 1:
                return new PlayerTypeOne(name);
            case 2:
                return new PlayerTypeTwo(name);
            case 3:
                return new PlayerTypeThree(name);
            case 4:
                return new PlayerTypeFour(name);
            default:
                break;
        }

        return null;
    }
}
