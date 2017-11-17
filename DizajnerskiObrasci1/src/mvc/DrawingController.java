package mvc;

import java.awt.Color;

import java.awt.event.MouseEvent;

import composite.SremBanatBacka;
import rekapitulacijaDO.Point;

public class DrawingController {
	private DrawingModel model;
	private DrawingFrame frame;
	
	public DrawingController(DrawingModel model, DrawingFrame frame) {
		this.model = model;
		this.frame = frame;
	}

	public void viewMouseClicked(MouseEvent arg0) {
		Point srem = new Point(20,20, Color.BLUE);
		Point banat = new Point(30,20, Color.BLUE);
		Point backa = new Point(25,12, Color.BLUE);
		
		SremBanatBacka sbb = new SremBanatBacka();
		sbb.add(srem);
		sbb.add(banat);
		sbb.add(backa);
		
		model.add(sbb);
		model.getShapes().add(new Point(arg0.getX(), arg0.getY(), Color.RED));
		
	}
	

}
