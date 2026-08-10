package figures;

import java.awt.*;

public class Rect {
    int x, y;
    int w, h;

    Color borderColor;
    Color backgroundColor;

    public Rect(int x, int y, int w, int h, Color borderColor, Color backgroundColor) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;

        this.borderColor = borderColor;
        this.backgroundColor = backgroundColor;
    }

    public void print() {
        System.out.format(
            "Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n", this.w, this.h, this.x, this.y);
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(this.backgroundColor);
        g2d.fillRect(this.x, this.y, this.w, this.h);

        g2d.setColor(this.borderColor);
        g2d.drawRect(this.x, this.y, this.w, this.h);
    }
}
