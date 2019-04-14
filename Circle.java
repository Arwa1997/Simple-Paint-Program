/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.edu.alexu.cse.oop.draw;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Arwa
 */
public class Circle implements Shape {

    protected int xCoord,yCoord;
    protected int r;
    public Circle() {
        String x = JOptionPane.showInputDialog("X Coordinate", "Enter an x coordinate");
        int xCoord = Integer.parseInt(x);
        String y = JOptionPane.showInputDialog("Y Coordinate", "Enter a y coordinate");
        int yCoord = Integer.parseInt(y);
        String radius = JOptionPane.showInputDialog("Radius", "Enter the length of the radius");
        int r = Integer.parseInt(radius);
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.r = r;
    }
    
    
    
    @Override
    public void setPosition(Point position) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Point getPosition() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setProperties(Map<String, Double> properties) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Map<String, Double> getProperties() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setColor(Color color) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Color getColor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFillColor(Color color) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Color getFillColor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     
    @Override
    public void draw(Graphics MyCanvas) {
       
     
        MyCanvas.setColor(Color.red);
        
        MyCanvas.drawOval(xCoord,yCoord,r,r);
        MyCanvas.fillOval(xCoord,yCoord,r,r);
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException{
        return null;
    }


    //public static void main(String[] args) {
        // TODO code application logic here
}
