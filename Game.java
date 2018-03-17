package tilegame;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;




public class Game implements Runnable{
    private Display display;
    private int width,height;
    private String title;
    private Thread thread;
    private boolean running=false;
    private BufferStrategy bs;
    private Graphics g;
    
    //states
    private State gameState;
    private StateManager SM;
    
    //input
    private KeyManager KM;
    public Game(String title, int width,int height){
        this.height=height;
        this.width=width;
       SM = new StateManager();
        KM=new KeyManager();
        
    
    }
    
 
    private void init() throws IOException {     
       display=new Display(title,width,height);
       display.getFrame().addKeyListener(KM);
       Assets.init();
       gameState= new GameState(this);
       
       SM.setState(gameState);//sets the state of thr game to state where it can show grass tile
        }

    private void tick() {
        KM.tick();
       if(SM.getState()!=null){
       SM.getState().tick();
       }
        }

    private void render() {
        bs= display.getCanvas().getBufferStrategy();
        
        if(bs==null){
        display.getCanvas().createBufferStrategy(3);
        return;
        }
        g=bs.getDrawGraphics();
        g.clearRect(0, 0, width, height);
       if(SM.getState()!=null){
       SM.getState().render(g);
       }
        
        
        //drawing ends here
        bs.show();
        g.dispose();
        }
    
    
    @Override
    public void run() {
        try {
            init();
        } catch (IOException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
        int fps=60;//frames per seconds or updates per sec
        double timePerTick=1000000000/fps;//time taken to do one tick
        double delta=0;
        long now;
        long lastTime=System.nanoTime();
        
        while(running){
            
            now =System.nanoTime();
            delta+=(now-lastTime)/timePerTick;
            lastTime=now;
            if(delta>=1){
                tick();
                render();
                delta--;
            }
        }
        
        
        
        try {
            stop();
        } catch (InterruptedException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    public KeyManager getKeyManager(){
    return KM;
    }
    
    public synchronized void start(){
        if(running)
            return;
        running=true;
    thread =new Thread(this);
    thread.start();
    }
    public synchronized void stop() throws InterruptedException{
        if(!running)
            return;
        running=false;
        thread.join();
    
    }

    
}
