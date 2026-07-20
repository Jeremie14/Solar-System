package view;

import javax.swing.*;
import java.awt.*;

public class SunDisplay extends JPanel {

    private int rayon;
    private Color color;

    public SunDisplay() {
        rayon = 50;
        color = Color.ORANGE;
        setBackground(Color.BLACK);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(color);
        g.fillOval(700, 400, rayon, rayon);
    }

}
