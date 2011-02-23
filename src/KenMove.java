import javax.swing.Icon;


public class KenMove extends RandMove {

	@Override
	public void move(Canvas c, Sprite s) {
		super.speed = 5;
		super.move(c, s);
	}

}
