package myprojects.tclicker;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import myprojects.tclicker.screens.SplashScreen;

public class tClickerGame extends Game {

    public final static String GAME_NAME = "tClicker";
    public static int WIDTH = 480;
    public static int HEIGHT = 700;

    private boolean paused;

    @Override
    public void create() {
        this.setScreen(new SplashScreen(this));
    }


    @Override
    public void dispose() {
    }


/*getters and setters
    */
    public boolean isPaused() {
        return paused;
    }

    public void setPaused(boolean paused) {
        this.paused = paused;
    }




}
