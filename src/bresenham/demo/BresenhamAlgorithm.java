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
public class BresenhamAlgorithm extends JPanel{
    public int pixelSize = 1;
   public void paintComponent(Graphics g, int Xinicial, int Xfinal, int Yinicial, int Yfinal) { 
       drawLine(g, Xinicial, Yinicial, Xfinal, Yfinal); //Desenha a linha da letra A
    }
   
    private void plot(Graphics g, int x, int y) {//função para plotar o pixel na tela
        g.setColor(Color.black);//cor em que vou desenhar
        g.drawOval(x, y, pixelSize, pixelSize);//desenha um circulo para simular o pixel

    }
 
    private void drawLine(Graphics g, int x1, int y1, int x2, int y2) {
        int d = 0;
 
        int dx = Math.abs(x2 - x1); //pega o valor absoluto
        int dy = Math.abs(y2 - y1); //pega o valor absoluto
 
        int dx2 = 2 * dx; // fatores de escala de inclinação
        int dy2 = 2 * dy; // evitar ponto flutuante
 
        
        int ix = x1 < x2 ? 1 : -1; 
        int iy = y1 < y2 ? 1 : -1;
 
        int x = x1;
        int y = y1;
 
        if (dx >= dy) {
            while (true) {
                plot(g, x, y); //plota o ponto em xy
                if (x == x2)
                    break;
                x += ix;
                d += dy2;
                if (d > dx) {
                    y += iy;
                    d -= dx2;
                }
            }
        } else {
            while (true) {
                plot(g, x, y);
                if (y == y2)
                    break;
                y += iy;
                d += dx2;
                if (d > dy) {
                    x += ix;
                    d -= dy2;
                }
            }
        }
        }
}
