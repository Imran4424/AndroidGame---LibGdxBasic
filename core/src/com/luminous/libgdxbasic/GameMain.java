package com.luminous.libgdxbasic;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import helpers.GameInfo;

public class GameMain extends Game {
	public SpriteBatch batch;
	
	@Override
	public void create () {

	}

	@Override
	public void render () {

	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
