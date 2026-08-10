package figures;

import java.awt.*;

public class Triangle {
    int x1, y1;
    int x2, y2;
    int x3, y3;

    Color borderColor;
    Color backgroundColor;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3, Color borderColor, Color backgroundColor) {

        this.x1 = x1;
        this.y1 = y1;

        this.x2 = x2;
        this.y2 = y2;

        this.x3 = x3;
        this.y3 = y3;

        this.borderColor = borderColor;
        this.backgroundColor = backgroundColor;
    }

    public void print() {
        System.out.format("Triangulo com pontos (%d,%d), (%d,%d), (%d,%d).\n", this.x1, this.y1, this.x2, this.y2, this.x3, this.y3);
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        int[] x = {this.x1, this.x2, this.x3};
        int[] y = {this.y1, this.y2, this.y3};

        Polygon triangle = new Polygon(x, y, 3);

        g2d.setColor(this.backgroundColor);
        g2d.fillPolygon(triangle);

        g2d.setColor(this.borderColor);
        g2d.drawPolygon(triangle);
    }
}
