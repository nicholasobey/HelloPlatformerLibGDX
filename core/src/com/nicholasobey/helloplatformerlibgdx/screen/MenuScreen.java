package com.nicholasobey.helloplatformerlibgdx.screen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class MenuScreen extends AbstractScreen {

    TextButtonStyle playButtonStyle;
    TextButton playButton;
    Stage stage;

    public MenuScreen(final Game game) {
        super(game);

        stage = new Stage(new ScreenViewport());

        BitmapFont font = new BitmapFont();

        playButtonStyle = new TextButtonStyle();
        playButtonStyle.font = font;

        playButton = new TextButton("Play", playButtonStyle);
        playButton.addListener(new InputListener() {
            @Override
            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                game.setScreen(new PlayScreen(game));
            }

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                return true;
            }
        });

        playButton.setSize(32, 32);
        playButton.setPosition((stage.getWidth() / 2) - (playButton.getWidth() / 2) - 10, (stage.getHeight() / 2) - (playButton.getHeight() / 2));
        playButton.setTransform(true);
        playButton.scaleBy(1);

        stage.addActor(playButton);

        LabelStyle instructionsStyle = new LabelStyle();
        instructionsStyle.font = font;

        Label instructions = new Label("Controls:\nA or Left Arrow to move left\nD or Right Arrow to move right\nW or Up Arrow to jump\nR to reset (counts as death)\nClick and hold mouse to draw platforms", instructionsStyle);
        instructions.setPosition(playButton.getX() - 96, playButton.getY() - 128);

        stage.addActor(instructions);
    }

    @Override
    public void show() {
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        stage.act();
        stage.draw();
    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        stage.dispose();
    }
}
