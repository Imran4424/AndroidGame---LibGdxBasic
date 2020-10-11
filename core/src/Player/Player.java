package Player;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;

/**
 * Created by Shah Md Imran Hossain on 04, October, 2020
 */

public class Player extends Sprite {
    private World world;
    private Body body;

    public Player(String name, float x, float y) {
        super(new Texture(name));
        setPosition(x - getWidth() / 2, y - getHeight() / 2);
    }
}
