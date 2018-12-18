
package javanetworking;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class Draw {
    
    static void DrawAll(ArrayList<Object> objects, Graphics2D g){
        for(Object o : objects){
            drawObject(o,g);
        }
    }
    
    
    private static void drawObject(Object o,Graphics2D g){
        if(o.getType() == Object.ObjectType.BLOCK){
            Block b = (Block)o;
            g.setColor(Color.black);
            g.fillRect(b.getX()-(b.getWidth()/2), b.getY()-(b.getHeight()/2), b.getWidth(), b.getHeight());
        }
    } 
    
    
}