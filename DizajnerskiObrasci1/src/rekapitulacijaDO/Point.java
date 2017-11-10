package rekapitulacijaDO;

import java.awt.Color;
import java.awt.Graphics;

public class Point extends Shape{
	private int x;
	private int y;
	
	public Point() {
		
	}
	public Point(int x, int y, Color color) {
		super(color);
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}

	@Override
	public void moveBy(int x, int y) {
		this.x = this.x + x;
		this.y = this.y + y;
		
	}

	@Override
	public void moveTo(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

	@Override
	public void drawShape(Graphics g) {
		g.setColor(getColor());
		g.drawLine(this.x-1, this.y-1, this.x+1, this.y+1);
		g.drawLine(this.x-1, this.y+1, this.x+1, this.y-1);
	}

}
