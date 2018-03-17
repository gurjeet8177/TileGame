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
public class Creature extends Entity{
    protected int health;
  public Creature(float x,float y,int width,int height){
  super(x,y, width, height);
  health=10;  
}

    @Override
    public void tick() {
        
    }

    @Override
    public void render(Graphics g) {
    }  
   
    
}
