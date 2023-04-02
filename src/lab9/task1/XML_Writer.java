package lab9.task1;


import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class XML_Writer extends JComponent {

  private static XML_Writer XML_writer;

  public static XML_Writer getXML_writer() {
    if (XML_writer == null) {
      XML_writer = new XML_Writer();
    }
    return XML_writer;
  }

  private List<Arc>  arcs;
  private List<Line> lines;
  private List<Pixel> pixels;

  private JFrame frame;

  private XML_Writer() {
    super();

    frame = new JFrame("XML_Writer");
    frame.setSize(400, 400);
    frame.setLocation(1000, 600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add( this );

    arcs  = new LinkedList<Arc>();
    lines = new LinkedList<Line>();
    pixels = new LinkedList<Pixel>();

    frame.setVisible(true);
  }

  public synchronized void drawLine(int x1, int y1, int x2, int y2) {
    lines.add(new Line(x1, y1, x2, y2));
    repaint();
  }

  public synchronized void drawCircle(int x, int y, int r) {
    arcs.add(new Arc(x, y, r));
  }
  public synchronized void drawPixel(int x, int y){
    pixels.add(new Pixel(x,y));
    repaint();
  }
  public synchronized void paint(Graphics g) {
    g.setColor(Color.green);
    for (Line line : lines) {
      g.drawLine(line.x1, line.y1, line.x2, line.y2);
    }

    for (Arc arc : arcs) {
      g.drawArc(arc.x, arc.y, arc.r*2, arc.r*2, 0, 360);
    }
    for (Pixel pixel: pixels){
      g.setColor(Color.green);
      g.fillOval(pixel.x, pixel.y, 5,5);
    }
  }

}
