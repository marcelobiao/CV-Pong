package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.PongGame;

public class DesktopLauncher {
	int leftY = 0;
	int rightY = 0;
	public static void main (String[] arg) {
		OpenCV openCV = new OpenCV();
		openCV.start();
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new PongGame(), config);
	}
}