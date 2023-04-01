public class Dot extends Shape{
    public Dot(int x, int y){
        super(x,y);
    }

    @Override
    public void draw() {
        draw.drawPixel(x,y);
    }
}
