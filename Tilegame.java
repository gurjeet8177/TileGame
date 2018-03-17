package tilegame;

import javax.swing.JApplet;
import javax.swing.*;
public class Tilegame extends JApplet{

    public static void main(String[] args) throws InterruptedException {
  
        
        Game g1= new Game("title",600,700);
             g1.start();
        
        
    }
    
}
