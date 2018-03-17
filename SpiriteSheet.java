
package tilegame;

import java.awt.image.BufferedImage;


public class SpiriteSheet {
    private BufferedImage sheet;
    
    public SpiriteSheet(BufferedImage sheet){
        this.sheet=sheet;
    }
    
    public BufferedImage crop(int x, int y, int height,int width){
    
        return sheet.getSubimage(x, y, height, width);
    }
}
