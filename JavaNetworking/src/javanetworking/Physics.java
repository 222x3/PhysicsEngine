
package javanetworking;
import java.util.ArrayList;

class Physics {
    private final static int gravity = 1;
    private final static int meter = 1;
    
    
    
    static void Tick(ArrayList<Object> objects){
        for(Object o : objects){
            physics(o);
        }
    }
    
    static void physics(Object o){
        if(o.getType() == Object.ObjectType.BLOCK){
            Block b = (Block)o;
            b.addAcceleration(0, gravity);
            b.addVelocity();
            b.updatePosition();
        }
    }
}
