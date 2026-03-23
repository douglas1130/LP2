import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hello2DApp {
    public static void main (String[] args) {
        Hello2DFrame frame = new Hello2DFrame();
    }
}

class Hello2DFrame extends JFrame {
    public Hello2DFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java2D - Hello World!");
        this.setSize(350, 350);
        this.setVisible(true);
    }

    public void paint (Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        int w = getWidth();
        int h = getHeight();
        g2d.setColor(Color.black);
        g2d.fillRect(0, 0, w, h);
        g2d.setPaint(Color.green);
        g2d.drawLine(0,0, w,h);
        g2d.drawLine(0,h, w,0);
        g2d.setPaint(Color.white);
        int x1 = w/4;
        int y1 = h/4;

        int x2 = (3*w)/4;
        int y2 = (3*h)/4;

        int largura = x2 - x1;
        int altura = y2 - y1;

        g2d.drawRect(x1, y1, largura, altura);
    }
}
