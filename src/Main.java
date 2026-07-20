import javax.swing.*;
import java.awt.*;
import view.SunDisplay;
import view.MercuryDisplay;


public class Main {

    public static void main(String[] args) {

        JFrame window = new JFrame("Solar System Simulator");

        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.getContentPane().setBackground(Color.BLACK);

        SunDisplay sun = new SunDisplay();
        window.add(sun);

        /*MercuryDisplay mercury = new MercuryDisplay();
        window.add(mercury);*/


        window.setVisible(true);
    }
}