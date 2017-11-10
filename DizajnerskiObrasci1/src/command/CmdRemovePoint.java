package command;

import mvc.DrawingModel;
import rekapitulacijaDO.Point;

public class CmdRemovePoint implements Command{
	private DrawingModel model;
	private Point point;
	
	public CmdRemovePoint(DrawingModel model, Point point) {
		this.model = model;
		this.point = point;
	}
	
	@Override
	public void execute() {
		model.remove(point);
		
	}

	@Override
	public void unexecute() {
		model.add(point);
		
	}
}
