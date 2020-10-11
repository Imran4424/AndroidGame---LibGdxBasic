package Player;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
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

    void createBody() {
        BodyDef bodyDef = new BodyDef();

        // a static body is not affected by gravity or other forces
        // a kinematic body is not affected by gravity but it is affected by other forces
        // a dynamic body is affected by gravity and other forces
        bodyDef.type = BodyDef.BodyType.DynamicBody;

        bodyDef.position.set(getX(), getY());

        body = world.createBody(bodyDef);

        PolygonShape polygonShape = new PolygonShape();
        polygonShape.setAsBox(getWidth() / 2, getHeight() / 2);

        FixtureDef fixtureDef = new FixtureDef();
        fixtureDef.shape = polygonShape;
        // mass
        fixtureDef.density = 1;

        Fixture fixture = body.createFixture(fixtureDef);
    }
}
