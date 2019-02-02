package myprojects.tclicker.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import myprojects.tclicker.tClickerGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = tClickerGame.GAME_NAME;
		config.width = tClickerGame.WIDTH;
		config.height = tClickerGame.HEIGHT;
		config.resizable = false;

		new LwjglApplication(new tClickerGame(), config);
	}
}
