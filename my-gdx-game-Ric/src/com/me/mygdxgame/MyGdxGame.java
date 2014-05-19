package com.me.mygdxgame;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class MyGdxGame implements ApplicationListener {
	//private OrthographicCamera camera;
	private Texture texture;
	Stage stage;
	Image fondo;
	Image nave;
	Image enemigo;
	
	//boolean izquierda=false;
	//boolean derecha=false;
	
	@Override
	public void create() {		
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		
		stage = new Stage();
		//fondo = new Image(region);
		stage = new Stage();
		texture = new Texture(Gdx.files.internal("data/libgdx.png"));
		texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		nave = new Image(new Texture(Gdx.files.internal("data/nave.png")));
		fondo = new Image(new Texture(Gdx.files.internal("data/fondo.png")));
		enemigo = new Image(new Texture(Gdx.files.internal("data/enemigo.png")));

		TextureRegion region = new TextureRegion(texture, 0, 0, 512, 275);
		
		
		fondo.setX(0);
		fondo.setY(-100);
		nave.setX(25);
		nave.setY(25);
		enemigo.setX(300);
		enemigo.setY(150);
		
		stage.addActor(fondo);
		stage.addActor(nave);
		stage.addActor(enemigo);
	}

	@Override
	public void dispose() {
		texture.dispose();
	}

	@Override
	public void render() {		
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		stage.draw();
		
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
}
