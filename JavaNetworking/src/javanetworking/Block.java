
package javanetworking;
public class Block extends Object{
    private double width;
    private double height;
    Block(double _w , double _h , double _x,double _y,double m,double vx,double vy, double ax,double ay){
        super(_x,_y,m,vx,vy,ax,ay,Object.ObjectType.BLOCK);
        width=_w;
        height=_h;
    }
    
    static void Create(double _w , double _h , double _x,double _y,double m,double vx,double vy, double ax,double ay){
        Block b = new Block(_w,_h,_x,_y,m,vx,vy,ax,ay);
        Object.addObject(b);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    double getWidth(){
        return width;
    }
    double getHeight(){
        return width;
    }
}
