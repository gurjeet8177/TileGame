
package tilegame;

import java.awt.Graphics;


public class GameState extends State{
    private  Player p;
    public GameState(Game game ){
        super(game);
    p=new Player(game,100,100);
    }

    @Override
    public void tick() {
        p.tick();
        }

    @Override
    public void render(Graphics g) {
       p.render(g);
         }
    
}
