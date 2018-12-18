
package javanetworking;
public class Block extends Object{
    private int width;
    private int height;
    Block(int _w , int _h , int _x,int _y,double m,int vx,int vy, int ax,int ay){
        super(_x,_y,m,vx,vy,ax,ay,Object.ObjectType.BLOCK);
        width=_w;
        height=_h;
    }
    
    static void Create(int _w , int _h , int _x,int _y,double m,int vx,int vy, int ax,int ay){
        Block b = new Block(_w,_h,_x,_y,m,vx,vy,ax,ay);
        Object.addObject(b);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    int getWidth(){
        return width;
    }
    int getHeight(){
        return width;
    }
}
