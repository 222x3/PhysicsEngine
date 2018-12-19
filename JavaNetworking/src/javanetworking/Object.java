
package javanetworking;

import java.util.ArrayList;

public class Object {
    static enum ObjectType{
        BLOCK
    };
    
    private static ArrayList<Object> objects = new ArrayList<Object>();
    
    private double x; //Position
    private double y; //Position
    
    private double mass; //Measured in kilograms
    
    private double velocity_x; //meters per second 
    private double velocity_y; //meters per second 
    
    private double acceleration_x; //meters per second squared
    private double acceleration_y; //meters per second squared
    
    private ObjectType type; //Type of object
    
    
    Object(double _x,double _y,double m,double vx,double vy, double ax,double ay, ObjectType _type){
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
    double getX(){
        return x;
    }
    double getY(){
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
    void setAcceleration(double ax,double ay){
        acceleration_x=ax;
        acceleration_y=ay;
    }


    

}
