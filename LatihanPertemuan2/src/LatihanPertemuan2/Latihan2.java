package LatihanPertemuan2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Latihan2
{
    public static void main(String aths[])
    {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pnl = new PolygonLat2();
        pnl.setSize(100, 200);
        f.getContentPane().add(pnl);
        f.setSize(400,280);
        f.setLocation(200,200);
        f.setVisible(true); 
        
    }
}

class PolygonLat2 extends JPanel
{
    public PolygonLat2()
    {
        setBackground(Color.BLUE);
        
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        Polygon p=new Polygon();
        

        p.addPoint(20,20);
        p.addPoint(40,40);
        p.addPoint(70,10);
        p.addPoint(80,50);
        p.addPoint(100,70);
        p.addPoint(10,80);

        g2.setColor(Color.BLACK);
        g2.draw(p);
        g2.setColor(new Color(120,250,100));
        g2.fillPolygon(p);
    
        
        
        //g2.fillPolygon(p.xpoints,p.ypoints,p.npoints);

    }
}