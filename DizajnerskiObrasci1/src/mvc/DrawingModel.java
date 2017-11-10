package mvc;

import java.util.ArrayList;

import rekapitulacijaDO.Shape;

public class DrawingModel {
	private ArrayList<Shape> shapes = new ArrayList<Shape>();
	
	public ArrayList<Shape> getShapes(){
		return shapes;
	}
	
	public void add(Shape s) {
		shapes.add(s);
	}
	
	public Shape get(int i) {
		return shapes.get(i);
	}
	
	public boolean remove(Shape s) {
		return shapes.remove(s);
	}

}
