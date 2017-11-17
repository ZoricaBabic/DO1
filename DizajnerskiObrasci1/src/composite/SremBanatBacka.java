package composite;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

import rekapitulacijaDO.Shape;

public class SremBanatBacka extends Shape{
	
	private ArrayList<Shape> children = new ArrayList<Shape>();
	
	public void add(Shape s) {
		children.add(s);
	}
	
	public boolean remove(Shape s) {
		return children.remove(s);
	}

	@Override
	public void moveBy(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveTo(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawShape(Graphics g) {
		Iterator<Shape> it = children.iterator();
		while(it.hasNext()) {
			it.next().drawShape(g);
		}
		
	}

}
