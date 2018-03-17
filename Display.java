/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tilegame;

import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Dimension;
public final class Display {
    private JFrame frame;
    private String title;
    private int width, height;
    private Canvas canvas;
    
    public Display(String title,int height,int width){
        this.height=height;
        this.width=width;
        this.title=title;
        createDisplay();
    }
    
    public void createDisplay(){
        frame= new JFrame(title);
        frame.setSize(width,height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        
        canvas  = new Canvas();
        canvas.setPreferredSize(new Dimension(width,height));
         canvas.setMaximumSize(new Dimension(width,height));
         canvas.setMinimumSize(new Dimension(width,height));
         canvas.setFocusable(false);
         
         frame.add(canvas);
         frame.pack();
        
    }
    public Canvas getCanvas(){
    return canvas;
    }
    public JFrame getFrame(){
    
    return frame;
    }
    
}
