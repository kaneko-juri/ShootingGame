
public class PlayerBullet extends Character{
	
	public void draw (MyFrame f) {
		
		f.setColor(70, 130, 180);
		f.fillRect(x+10, y, 10, 10);
		
		
	}
	
	

	public PlayerBullet(double x, double y, double vx, double vy) {
		
		super(x, y, vx, vy);
		
	}

}
