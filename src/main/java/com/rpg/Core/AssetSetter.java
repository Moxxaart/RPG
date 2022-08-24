package com.rpg.Core;

public class AssetSetter {

    GamePanel gp;
    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void SetObject() {

        gp.obj[0] = new OBJ_Key();
        gp.obj[0].worldX = 36 * gp.tileSize;
        gp.obj[0].worldY = 20 * gp.tileSize;
    }
}
