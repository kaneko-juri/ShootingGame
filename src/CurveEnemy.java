
public class CurveEnemy extends Enemy{

	public CurveEnemy(double x, double y, double vx, double vy) {
		
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void move() {
		
		super.move();
		
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
		
	}
	
	public void draw (MyFrame f) {
		
		f.setColor(0, 0, 0);
		f.fillOval(x, y, 30, 30);
		f.setColor(143, 188, 143);
		f.fillOval(x+5, y, 20, 30);
		
	}
}
