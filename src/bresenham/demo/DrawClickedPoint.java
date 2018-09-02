/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bresenham.demo;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Mateus Junges <contato@mateusjunges.com>
 */
public class DrawClickedPoint extends JPanel{
    
    public void paintComponent(Graphics g, int X, int Y){
        g.setColor(Color.red);
        g.drawLine(X, Y, X+10, Y+10);
        g.drawLine(X, Y, X+10, Y-10);
        g.drawLine(X, Y, X-10, Y-10);
        g.drawLine(X, Y, X-10, Y+10);
        
    }
}
