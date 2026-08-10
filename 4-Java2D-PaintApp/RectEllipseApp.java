import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

class RectEllipseApp {
    public static void main (String[] args) {
        RectEllipseFrame frame = new RectEllipseFrame();
        frame.setVisible(true);
    }
}

class RectEllipseFrame extends JFrame {
    Rect r1;
    Ellipse e1;
    Ellipse e2;
    Ellipse e3;

    RectEllipseFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Rect + Ellipse");
        this.setSize(350, 350);
        this.r1 = new Rect(50,50, 100,30);
        this.e1 = new Ellipse(50, 100, 100, 30, Color.BLUE, Color.WHITE);

        this.e2 = new Ellipse(50, 150, 80, 100, Color.BLACK, Color.PINK);

        this.e3 = new Ellipse(180, 100, 120, 80, Color.CYAN, Color.DARK_GRAY);
    }

    public void paint (Graphics g) {
        super.paint(g);
        this.r1.paint(g);
        this.e1.paint(g);
        this.e2.paint(g);
        this.e3.paint(g);   
    }
}

class Rect {
    int x, y;
    int w, h;

    Rect (int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    void print () {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    void paint (Graphics g) {
        g.drawRect(this.x,this.y, this.w,this.h);
    }
}

class Ellipse {
    int x, y;
    int w, h;

    Color borderColor;
    Color backgroundColor;

    Ellipse(int x, int y, int w, int h,
            Color borderColor, Color backgroundColor) {

        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;

        this.borderColor = borderColor;
        this.backgroundColor = backgroundColor;
    }

    void print() {
        System.out.format(
            "Elipse de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y
        );
    }

    void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(this.backgroundColor);
        g2d.fill(new Ellipse2D.Double(
            this.x, this.y, this.w, this.h
        ));

        g2d.setColor(this.borderColor);
        g2d.draw(new Ellipse2D.Double(
            this.x, this.y, this.w, this.h
        ));
    }

}
