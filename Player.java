
package tilegame;

import java.awt.Graphics;

/**
 *
 * @author garry
 */
public class Player extends Creature {
    private Game game; 
    public Player(Game game,float x, float y) {
        super(x,y,30,30);
        this.game=game;
    }
    @Override
    public void tick(){
    if(game.getKeyManager().up)
        y-=3;
    
    if(game.getKeyManager().down)
        y+=3;
    
    if(game.getKeyManager().left)
        x-=3;
   
    
    if(game.getKeyManager().right)
        x+=3;
    }
    public void render(Graphics g){
    g.drawImage(Assets.player, (int)x,(int)y, null);
    }
    
    
}
