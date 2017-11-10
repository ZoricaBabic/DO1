package command;

import mvc.DrawingModel;
import rekapitulacijaDO.Point;

public class CmdAddPoint implements Command{
	private DrawingModel model;
	private Point point;
	
	public CmdAddPoint(DrawingModel model, Point point) {
		this.model = model;
		this.point = point;
	}
	
	@Override
	public void execute() {
		model.add(point);
		
	}

	@Override
	public void unexecute() {
		model.remove(point);
		
	}

}
