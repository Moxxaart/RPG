package com.rpg.Core;

import com.rpg.Object.OBJ_Chest;
import com.rpg.Object.OBJ_Door;
import com.rpg.Object.OBJ_Key;

public class AssetSetter {

    GamePanel gp;
    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject() {

        gp.obj[0] = new OBJ_Key();
        gp.obj[0].worldX = 21 * gp.tileSize;
        gp.obj[0].worldY = 18 * gp.tileSize;

        gp.obj[1] = new OBJ_Key();
        gp.obj[1].worldX = 25 * gp.tileSize;
        gp.obj[1].worldY = 40 * gp.tileSize;

        gp.obj[2] = new OBJ_Door();
        gp.obj[2].worldX = 8 * gp.tileSize;
        gp.obj[2].worldY = 13 * gp.tileSize;

        gp.obj[3] = new OBJ_Chest();
        gp.obj[3].worldX = 8 * gp.tileSize;
        gp.obj[3].worldY = 11 * gp.tileSize;
    }
}
