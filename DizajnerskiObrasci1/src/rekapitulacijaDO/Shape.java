package rekapitulacijaDO;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape implements Moveable{
	private Color color;
	
	public Shape() {
		
	}
	
	public Shape(Color color) {
		this.color = color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
	public abstract void drawShape(Graphics g);
	
}
