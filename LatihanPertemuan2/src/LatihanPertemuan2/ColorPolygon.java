/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanPertemuan2;

import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author Taufik
 */

public class ColorPolygon extends Applet {
    @Override
    public void paint (Graphics g)
    {
        int x [] ={20,40,70,80,100,10};
        int y [] ={20,40,10,50,70,80};
        int p=6;
        g.drawPolygon(x,y,p);
        g.fillPolygon(x,y,p);
        
    }
//    <applet code="poly.class" width = "400" height = "400"></applet>
}
