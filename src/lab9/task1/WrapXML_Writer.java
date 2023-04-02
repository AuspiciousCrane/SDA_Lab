package lab9.task1;

public class WrapXML_Writer extends DrawingService {

    private XML_Writer XML_writer;
  
    public WrapXML_Writer() {
      XML_writer = XML_Writer.getXML_writer();
    }
  
    public void drawLine(int x1, int y1, int x2, int y2) {
      XML_writer.drawLine(x1, y1, x2, y2);
    }
  
    public void drawCircle(int x, int y, int r) {
      XML_writer.drawCircle(x, y, r);
    }
  
    public void drawPixel(int x, int y){XML_writer.drawPixel(x,y);}
  }
