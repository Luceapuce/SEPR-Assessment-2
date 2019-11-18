package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.GridPoint2;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

public class Entity {
    private static final int SPEED = 10;
    private Texture texture;
    private Vector3 position;
    private Vector3 velocity;
    private int width;
    private int height;

    public void update(float dt){
    }

    public void move(int x, int y) {
        position.add(x, y, 0);
    }

    public void setPosition(float x, float y) {
        this.position = new Vector3(x, y, 0);
    }

    public Vector3 getPosition() {
        return position;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Texture getTexture() {
        return texture;
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    public Entity(Vector3 position, int width, int height) { // used to create non-obstacles
        this.position = position;
        this.width = width;
        this.height = height;
        this.texture = new Texture("exampleUnit.png");
        velocity = new Vector3(0, 0, 0);
    }

    public Entity(Texture texture, Vector3 position, int width, int height) { // used when creating inherited objects
        this.texture = texture;
        this.position = position;
        this.width = width;
        this.height = height;
        velocity = new Vector3(0, 0, 0);
    }

    public Entity(int x, int y) { // Default constructor for easy testing
        this.texture = new Texture("exampleUnit.png");
        this.position = new Vector3(x, y, 0);
        this.width = 100;
        this.height = 100;
        velocity = new Vector3(0, 0, 0);
    }

    public Entity() {
        this.texture = new Texture("exampleUnit.png");
        this.position = new Vector3(50, 50, 0);
        this.width = 100;
        this.height = 100;
        velocity = new Vector3(0, 0, 0);
    }
}
