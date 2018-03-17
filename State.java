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
public abstract class State {
    protected Game game;
    public State(Game game){
        this.game=game;
    
    }
    public abstract void  tick();
     public abstract void  render(Graphics g);
    
}
