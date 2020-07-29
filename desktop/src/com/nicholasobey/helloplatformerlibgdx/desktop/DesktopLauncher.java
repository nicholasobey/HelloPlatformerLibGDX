package com.nicholasobey.helloplatformerlibgdx.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.nicholasobey.helloplatformerlibgdx.HelloPlatformerLibGDX;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "HelloPlatformerLibGDX";
		config.width = 640;
		config.height = 480;

		new LwjglApplication(new HelloPlatformerLibGDX(), config);
	}
}
