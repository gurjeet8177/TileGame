/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tilegame;

import java.awt.Graphics;

/**
 *
 * @author garry
 */
public abstract class Entity {
    protected float x,y;
    protected int width,height;
    public Entity(float x, float y,int width,int height){
    this.x=x;
    this.y=y;
    this.height=height;
    this.width=width;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    public abstract void tick();
     public abstract void render(Graphics g);
    
    
}
