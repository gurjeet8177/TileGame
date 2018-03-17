
package tilegame;

import java.awt.image.BufferedImage;
import java.io.IOException;


public class Assets {
    private static  BufferedImage sheet;
    public static BufferedImage grass,player,stone,tree,land;
    private static final int height=135,width=135;
    public static void init() throws IOException{
        sheet=ImageLoader.loadImage("/textures/grid.png");
    SpiriteSheet sheetObject = new SpiriteSheet(sheet);
       player = sheetObject.crop(0, 0, height, width);
       stone = sheetObject.crop(width, 0, height, width);
       grass= sheetObject.crop(width*2, 0, height, width);
       tree= sheetObject.crop(width*3, 0, height, width);
       land= sheetObject.crop(0, height, height, width);
    }
}
