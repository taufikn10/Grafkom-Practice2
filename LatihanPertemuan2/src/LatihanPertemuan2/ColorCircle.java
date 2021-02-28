/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanPertemuan2;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Taufik
 */
public class ColorCircle extends Frame {
  Shape circle = new Ellipse2D.Float(200.0f, 200.0f, 200.0f, 200.0f);
  Shape square = new Rectangle2D.Double(200, 200,200, 200);
  
  @Override
  public void paint(Graphics g) {
  Graphics2D ga = (Graphics2D)g;
  ga.draw(circle);
  ga.setPaint(Color.green);
  ga.fill(circle);
  ga.setPaint(Color.red);
  ga.draw(square);
  
  }

  public static void main(String args[]) {
  Frame frame = new ColorCircle();
  frame.addWindowListener(new WindowAdapter(){
  @Override
  public void windowClosing(WindowEvent we){
  System.exit(0);
  }
  });
  frame.setSize(600, 600);
  frame.setVisible(true);
  }
}