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
public class Line implements Shape {

    protected int x1,x2,y1,y2;
    Color color;
    protected int l;
   
    public Line() {
        String x = JOptionPane.showInputDialog("X Coordinate", "Enter an x coordinate");
        x1 = Integer.parseInt(x);
        String y = JOptionPane.showInputDialog("Y Coordinate", "Enter a y coordinate");
        y1 = Integer.parseInt(y);
        String xx2 = JOptionPane.showInputDialog("X Coordinate", "Enter end x coordinate");
        x2 = Integer.parseInt(xx2);
        String yy2 = JOptionPane.showInputDialog("Y Coordinate", "Enter end y coordinate");
        y2 = Integer.parseInt(yy2);
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
        
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
        MyCanvas.setColor(Color.blue);
        
        MyCanvas.drawLine(x1, y1,x2, y2);
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException{
        return null;
    }
}

