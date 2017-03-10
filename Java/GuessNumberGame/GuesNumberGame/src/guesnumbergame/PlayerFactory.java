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

        if (playerType == 1) {
            return new PlayerTypeOne();
        } else if (playerType == 2) {
            return new PlayerTypeTwo();
        } else if (playerType == 3) {
            return new PlayerTypeThree();
        } else if (playerType == 4) {
            return new PlayerTypeFour();
        }

        return null;
    }
}
