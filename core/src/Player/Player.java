package Player;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by Shah Md Imran Hossain on 04, October, 2020
 */

public class Player extends Sprite {

    public Player(String name, float x, float y) {
        super(new Texture(name));
        setPosition(x - getWidth() / 2, y - getHeight() / 2);
    }
}
