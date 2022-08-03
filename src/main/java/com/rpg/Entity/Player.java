package com.rpg.Entity;

import com.rpg.Core.GamePanel;
import com.rpg.Core.KeyHandler;
import com.rpg.Entity.Entity;

public class Player extends Entity {

    GamePanel gamePanel;
    KeyHandler keyHandler;

    public Player(GamePanel gp, KeyHandler keyH) {

        this.gamePanel = gp;
        this.keyHandler = keyH;
    }
}
