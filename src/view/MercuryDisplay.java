package view;

import javax.swing.*;
import java.awt.*;

public class MercuryDisplay extends JPanel {
    private int rayon;
    private Color color;

    public MercuryDisplay(){
        rayon = 25;
        color = Color.GRAY;
        setBackground(Color.BLACK);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(color);
        g.fillOval(900, 400, rayon, rayon);
    }
}
