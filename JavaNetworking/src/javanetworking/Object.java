
package javanetworking;

import java.util.ArrayList;

public class Object {
    static enum ObjectType{
        BLOCK
    };
    
    private static ArrayList<Object> objects = new ArrayList<Object>();
    
    private int x; //Position
    private int y; //Position
    
    private double mass; //Measured in kilograms
    
    private int velocity_x; //meters per second 
    private int velocity_y; //meters per second 
    
    private int acceleration_x; //meters per second squared
    private int acceleration_y; //meters per second squared
    
    private ObjectType type; //Type of object
    
    
    Object(int _x,int _y,double m,int vx,int vy, int ax,int ay, ObjectType _type){
        x=_x;
        y=_y;
        mass=m;
        type = _type;
        velocity_x=vx;
        velocity_y=vy;
        acceleration_x=ax;
        acceleration_y=ay;
    }
    
    
    
    
    
    
    
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    
                                                                                //Accessors    
    static ArrayList<Object> getObjects(){
        return objects;
    }   
    static void addObject(Object o){
        objects.add(o);
    }    
    ObjectType getType(){
        return type;
    }    
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
    
                                                                                //Mutators

    void updatePosition(){
        x+=velocity_x;
        y+=velocity_y;
    }
    void addVelocity(){
        velocity_x+=acceleration_x;
        velocity_y+=acceleration_y;
    }
    void setAcceleration(int ax,int ay){
        acceleration_x=ax;
        acceleration_y=ay;
    }


    

}
