package com.rpg.Object;

import com.rpg.Core.SuperObject;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Door extends SuperObject {

    public OBJ_Door() {

        name = "Door";
        collision = true;

        try {
            image = ImageIO.read(getClass().getResourceAsStream("/Tiles/item/door.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
