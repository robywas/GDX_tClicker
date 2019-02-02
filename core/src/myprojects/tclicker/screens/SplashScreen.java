package myprojects.tclicker.screens;

import com.badlogic.gdx.graphics.Texture;
import myprojects.tclicker.tClickerGame;

public class SplashScreen extends AbstractScreen {

    private Texture splashImg;

    public SplashScreen(tClickerGame game) {
        super(game);
        init();
    }

    private void init(){
        // TODO implemet better assets loading when game grows
        splashImg = new Texture("badlogic.jpg");
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        spriteBatch.begin();
        spriteBatch.draw(splashImg,0,0);
        spriteBatch.end();
    }
}
