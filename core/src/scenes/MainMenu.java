package scenes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.luminous.libgdxbasic.GameMain;

import helpers.GameInfo;

/**
 * Created by Shah Md Imran Hossain on 03, October, 2020
 */
public class MainMenu implements Screen {

    private GameMain game;
    private Texture bg;
    private Sprite player;

    public MainMenu(GameMain game) {
        this.game = game;
        bg = new Texture("Game BG.png");
        player = new Sprite(new Texture("Player 1.png"));
        player.setPosition(GameInfo.WIDTH / 2 - player.getWidth() / 2, GameInfo.HEIGHT / 2 - player.getHeight() / 2);
    }

    // first to call
    @Override
    public void show() {

    }

    // called based on number of frames per second - fps
    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0 , 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        game.getBatch().begin();
        game.getBatch().draw(bg, 0, 0);
        game.getBatch().draw(player, player.getX(), player.getY());
        game.getBatch().end();
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

    }
}
