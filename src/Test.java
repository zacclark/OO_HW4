import java.util.LinkedList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Test {

  public static void main(String[] args) {
    Canvas c = Canvas.getCanvas();
    c.requestFocus();

    c.addSprite(new NorthSouthSprite(400, 400));
    c.addSprite(new EastWestSprite(200, 200));
    c.addSprite(new KenSprite(240,500));
    c.addSprite(new BlueSprite(200,200));    
    c.addSprite(new RedSpriteAdapter(0,0));
  }

}
