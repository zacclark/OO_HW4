import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.Icon;


public class RedSpriteAdapter extends Sprite {
	RedSprite redSprite;
	
	public RedSpriteAdapter(int x, int y) {
		super(x, y);
		redSprite = new RedSprite(x, y);
	}

	@Override
	public void move(Canvas c) {
		redSprite.moveMe(c);
	}

	@Override
	public void animate(Canvas c) {
		redSprite.animateMe(c);
	}

	public void draw(Component c, Graphics g) {
		redSprite.drawMe(c, g);
		
		if (this.isHighlighted) {
			redSprite.highlightMe(c, g);
		}
	}
	
	public void highlight(Component c, Graphics g) {
		redSprite.highlightMe(c, g);
	}
}
