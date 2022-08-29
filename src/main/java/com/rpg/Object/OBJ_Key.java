package com.rpg.Object;

import com.rpg.Core.SuperObject;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Key extends SuperObject {

    public OBJ_Key() {

        name = "Key";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/Tiles/item/key.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
