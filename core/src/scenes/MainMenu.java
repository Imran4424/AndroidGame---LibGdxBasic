package scenes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.luminous.libgdxbasic.GameMain;

/**
 * Created by Shah Md Imran Hossain on 03, October, 2020
 */
public class MainMenu implements Screen {

    private GameMain game;
    private Texture bg;

    public MainMenu(GameMain game) {
        this.game = game;
        bg = new Texture("Game BG.png");
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
