package command;

import java.awt.Color;

import mvc.DrawingModel;
import rekapitulacijaDO.Point;

public class TestCommand {

	public static void main(String[] args) {
		DrawingModel model = new DrawingModel();
		Point point = new Point(10, 10, Color.RED);
		
		CmdAddPoint c1 = new CmdAddPoint(model, point);
		
		c1.execute();
		
		System.out.println(model.get(0));
		
		c1.unexecute();
		
		System.out.println(model.getShapes().size());
		
		CmdRemovePoint c2 = new CmdRemovePoint(model, point);
		
		c2.unexecute();
		
		System.out.println(model.get(0));
		
		c2.execute();
		
		System.out.println(model.getShapes().size());
		
		c1.execute();
		
		Point point2 = new Point(20, 20, Color.BLUE);
		
		CmdUpdatePoint c3 = new CmdUpdatePoint(point, point2);
		
		c3.execute();
		
		System.out.println(((Point)model.get(0)).getX());
		System.out.println(((Point)model.get(0)).getY());
		
		c3.unexecute();
		
		System.out.println(((Point)model.get(0)).getX());
		System.out.println(((Point)model.get(0)).getY());
		
		

	}

}
