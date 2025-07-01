
public class MiniEnemy extends Enemy{

	public MiniEnemy(double x, double y, double vx, double vy) {
		
		super(x, y, vx, vy);
		life = 1;
		score = 5;
		
	}
	
	public void move() {
		
		//super.move();
		x += vx;
		y += vy;
		
		int leftLimit = 0;
		int rightLimit = 370;
		
		if(x < leftLimit) x = 0;
		if(x > rightLimit) x = 370;

	}
	
	public void draw (MyFrame f) {
		
		f.setColor(0,128,128);
		f.fillOval(x, y, 20, 20);
		
	}

}
