package rekapitulacijaDO;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JPanel;

public class DrawingPnl extends JPanel{
	
	private ArrayList<Shape> shapes = new ArrayList<Shape>();
	
	public ArrayList<Shape> getShapes() {
		return shapes;
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Iterator<Shape> it = shapes.iterator();
		while(it.hasNext()) {
			it.next().drawObject(g);
		}
		repaint();
	}

}
