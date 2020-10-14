package scenes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.luminous.libgdxbasic.GameMain;

import Player.Player;
import helpers.GameInfo;

/**
 * Created by Shah Md Imran Hossain on 03, October, 2020
 */
public class MainMenu implements Screen {

    private GameMain game;
    private Texture bg;
    private Player player;
    private World world;
    private OrthographicCamera box2DCamera;
    private Box2DDebugRenderer box2DDebugRenderer;

    public MainMenu(GameMain game) {
        this.game = game;
        box2DCamera = new OrthographicCamera();
        box2DCamera.setToOrtho(false, GameInfo.WIDTH / GameInfo.PPM, GameInfo.HEIGHT / GameInfo.PPM);
        box2DCamera.position.set(GameInfo.WIDTH / 2f, GameInfo.HEIGHT / 2f, 0);

        box2DDebugRenderer = new Box2DDebugRenderer();

        world = new World(new Vector2(0, -9.8f), true);
        bg = new Texture("Game BG.png");
        player = new Player(world,"Player 1.png", GameInfo.WIDTH / 2, GameInfo.HEIGHT / 2);
    }

    // first to call
    @Override
    public void show() {

    }

    // called based on number of frames per second - fps
    @Override
    public void render(float delta) {
        player.updatePlayer();

        Gdx.gl.glClearColor(1, 0, 0 , 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        game.getBatch().begin();
        game.getBatch().draw(bg, 0, 0);
        game.getBatch().draw(player, player.getX(), player.getY());
        game.getBatch().end();

        box2DDebugRenderer.render(world, box2DCamera.combined);
        world.step(Gdx.graphics.getDeltaTime(), 6, 2);
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    // this will be called when we terminate the application or scene
    @Override
    public void dispose() {
        bg.dispose();
        player.getTexture().dispose();
    }
}
