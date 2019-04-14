/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg.edu.alexu.cse.oop.draw;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Arwa
 */
public class Rectangle implements Shape {
    protected int h,w;
    protected int xCoord,yCoord;
    public Rectangle () {
         
        String x = JOptionPane.showInputDialog("X Coordinate", "Enter an x coordinate");
        xCoord = Integer.parseInt(x);
        String y = JOptionPane.showInputDialog("Y Coordinate", "Enter a y coordinate");
        yCoord = Integer.parseInt(y);
        String width = JOptionPane.showInputDialog("Width", "Enter the length of the width");
        w = Integer.parseInt(width);
        String height = JOptionPane.showInputDialog("Height", "Enter the length of the height");
        h = Integer.parseInt(height);
         this.xCoord= xCoord;
         this.yCoord = yCoord;
         this.h = h;
         this.w = w;
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
      
        
        
        MyCanvas.setColor(Color.yellow);

        MyCanvas.drawRect(xCoord,yCoord,w,h);
        MyCanvas.fillRect(xCoord,yCoord,w,h);
    }
    
       
    @Override
    public Object clone() throws CloneNotSupportedException{
        return null;
    }


    //public static void main(String[] args) {
        // TODO code application logic here

   
}
