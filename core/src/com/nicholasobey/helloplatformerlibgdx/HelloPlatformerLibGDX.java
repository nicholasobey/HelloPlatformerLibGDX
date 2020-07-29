package com.nicholasobey.helloplatformerlibgdx;

import com.badlogic.gdx.Game;
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.graphics.GL20;
//import com.badlogic.gdx.graphics.Texture;
//import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.nicholasobey.helloplatformerlibgdx.screen.MenuScreen;

public class HelloPlatformerLibGDX extends Game {
//	SpriteBatch batch;
//	Texture img;

	@Override
	public void create () {
		setScreen(new MenuScreen(this));
//		batch = new SpriteBatch();
//		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {
		super.render();
//		Gdx.gl.glClearColor(0, 0, 0, 1);
//		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//		batch.begin();
//		batch.draw(img, 0, 0);
//		batch.end();
	}
	
//	@Override
//	public void dispose () {
//		batch.dispose();
//		img.dispose();
//	}
}
