import javax.swing.*;
import java.awt.*;


public class Main {

    public static void main(String[] args) {

        JFrame window = new JFrame("Solar System Simulator");

        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.getContentPane().setBackground(Color.BLACK);

        window.setVisible(true);
    }
}