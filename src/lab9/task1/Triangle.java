package lab9.task1;

import java.lang.Math;

public class Triangle extends Shape {

    private int length;

    public Triangle(int x, int y, int length) {
        super(x, y);
        this.length = length;
    }

    @Override
    public void draw() {
        int p1_x = x;
        int p1_y = y;
        int p2_x = x + length;
        int p2_y = y;
        int p3_x = x + length/2;
        int p3_y = (int) (y + Math.round( Math.sqrt( (length*length) - (length/2.0 * length/2.0) ) ));
        draw.drawLine(p1_x, p1_y, p2_x, p2_y);
        draw.drawLine(p2_x, p2_y, p3_x, p3_y);
        draw.drawLine(p3_x, p3_y, p1_x, p1_y);
    }
    
}
