
public class StraightEnemy extends Enemy{

	public StraightEnemy(double x, double y, double vx, double vy) {
		
		super(x, y, vx, vy);
		life = 5;
		
	}
	
	public void move() {
		
		super.move();
		
		int leftLimit = 0;
		int rightLimit = 370;
		
		if(x < leftLimit) x = leftLimit;
		if(x > rightLimit) x = rightLimit;
		
	}

	public void draw (MyFrame f) {
		
		f.setColor(0, 0, 0);
		f.fillRect(x, y, 14, 15);
		f.setColor(0, 0, 0);
		f.fillRect(x+2, y+15, 10, 15);
		
		
	}
	

}
