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

    public Player getPlayer(int playerType) {

        switch (playerType) {
            case 1:
                return new PlayerTypeOne();
            case 2:
                return new PlayerTypeTwo();
            case 3:
                return new PlayerTypeThree();
            case 4:
                return new PlayerTypeFour();
            default:
                break;
        }

        return null;
    }
}
