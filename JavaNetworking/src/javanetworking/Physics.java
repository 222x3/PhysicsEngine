
package javanetworking;
import java.util.ArrayList;

class Physics {
    private final static int gravity = -10;
    private final static double meter = 0.1;
    
    
    
    static void Tick(ArrayList<Object> objects){
        for(Object o : objects){
            physics(o);
        }
    }
    
    static void physics(Object o){
        if(o.getType() == Object.ObjectType.BLOCK){
            Block b = (Block)o;
            b.setAcceleration(0, (int) (gravity*meter));
            b.addVelocity();
            b.updatePosition();
        }
    }
}
