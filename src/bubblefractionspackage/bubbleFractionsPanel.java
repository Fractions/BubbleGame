package bubblefractionspackage;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class bubbleFractionsPanel extends JPanel{
    
    Random gen = new Random();
    Bubble[] bubble = new Bubble[4];
    
    public bubbleFractionsPanel(){
        this.setBackground(Color.white);
        
        bubble[0] = new Bubble();
        bubble[1] = new Bubble();
        bubble[2] = new Bubble();
        bubble[3] = new Bubble();
    }
    
    public void moveBubbles(){
        for(int i = 0; i < 4; i++){
            int changeX = gen.nextInt(11)-5;
            int changeY = gen.nextInt(11)-5;
            
            //bubble[i].setxLoc(xLoc[]);
        }
        
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);  // clear panel
        g.setColor(Color.black);
        g.drawString("1/4 + 2/4 = ", 15, 20);
        g.drawRect(0, 0, 100, 30);
        
        g.setColor(Color.red);
        g.drawOval(100, 100, 50, 50);
        
        repaint();
    }
}