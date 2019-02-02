package myprojects.tclicker.screens;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import myprojects.tclicker.tClickerGame;

public abstract class AbstractScreen implements Screen {

    protected tClickerGame game;
    protected Stage stage;
    protected SpriteBatch spriteBatch;
    private OrthographicCamera camera;

    public AbstractScreen(tClickerGame game) {
        this.game = game;
        createCamera();

    }

    private void createCamera() {
        camera = new OrthographicCamera();
        camera.setToOrtho(false, tClickerGame.WIDTH, tClickerGame.HEIGHT);
        camera.update();
        stage = new Stage(new StretchViewport(tClickerGame.WIDTH, tClickerGame.HEIGHT, camera));
        spriteBatch = new SpriteBatch();
        Gdx.input.setInputProcessor(stage);
    }


    @Override
    public void render(float delta) {
        clearScreen();
        camera.update();
        spriteBatch.setProjectionMatrix(camera.combined);
    }

    @Override
    public void show() {
    }

    private void clearScreen() {
        Gdx.gl.glClearColor(0, 0, 0, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }

    @Override
    public void pause() {
        game.setPaused(false);

    }

    @Override
    public void resume() {
        game.setPaused(true);
    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        game.dispose();

    }

    @Override
    public void resize(int width, int height) {

    }
}
