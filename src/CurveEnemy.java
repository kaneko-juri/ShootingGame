
public class CurveEnemy extends Enemy{
	
	private double angle = 0;

	public CurveEnemy(double x, double y, double vx, double vy) {
		
		super(x, y, vx, vy);
		life = 2 + GameWorld.stage;
		score = 8;
		
	}

	public void move() {
		
		super.move();
		
		angle += 0.1;
		x += Math.sin(angle) * GameWorld.stage;
		y += vy;
		
		//自分がプレイヤーよりも左にいたら
		if (x < GameWorld.player.x) {
			
			//右に移動
			x++;
			
		}
		
		//自分がプレイヤーよりも右にいたら
		if (x > GameWorld.player.x) {
			
			//左に移動
			x--;
			
		}
		
		int leftLimit = 0;
		int rightLimit = 370;
		
		if (x < leftLimit) x = leftLimit;
		if (x > rightLimit) x = rightLimit;
		
	}
	
	public void draw (MyFrame f) {
		
		f.setColor(0, 0, 0);
		f.fillOval(x, y, 30, 30);
		f.setColor(143, 188, 143);
		f.fillOval(x+5, y, 20, 30);
		
	}
}
