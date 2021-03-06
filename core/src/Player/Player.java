package Player;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;

import helpers.GameInfo;

/**
 * Created by Shah Md Imran Hossain on 04, October, 2020
 */

public class Player extends Sprite {
    private World world;
    private Body body;

    public Player(World world, String name, float x, float y) {
        super(new Texture(name));
        this.world = world;
        setPosition(x - getWidth() / 2, y - getHeight() / 2);

        createBody();
    }

    void createBody() {
        BodyDef bodyDef = new BodyDef();

        // a static body is not affected by gravity or other forces
        // a kinematic body is not affected by gravity but it is affected by other forces
        // a dynamic body is affected by gravity and other forces
        bodyDef.type = BodyDef.BodyType.StaticBody;

        bodyDef.position.set(getX() / GameInfo.PPM, getY() / GameInfo.PPM);

        body = world.createBody(bodyDef);

        PolygonShape polygonShape = new PolygonShape();
        polygonShape.setAsBox((getWidth() / 2) / GameInfo.PPM,
                (getHeight() / 2) / GameInfo.PPM);

        FixtureDef fixtureDef = new FixtureDef();
        fixtureDef.shape = polygonShape;
        // mass
        fixtureDef.density = 1f;

        Fixture fixture = body.createFixture(fixtureDef);

        polygonShape.dispose();
    }

    public void updatePlayer() {
        this.setPosition(body.getPosition().x * GameInfo.PPM, body.getPosition().y * GameInfo.PPM);
    }
}
