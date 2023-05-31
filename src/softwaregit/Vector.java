/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package softwaregit;

/**
 *
 * @author karnedo
 */
public class Vector {
    
    private double x;
    private double y;
    
    public Vector(double x, double y){
        set(x, y);
    }
    
    public void set(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public void add(Vector v){
        this.x += v.x;
        this.y += v.y;
    }
    
    @Override
    public String toString(){
        return "[" + x + ", " + y + "]";
    }
    
}
