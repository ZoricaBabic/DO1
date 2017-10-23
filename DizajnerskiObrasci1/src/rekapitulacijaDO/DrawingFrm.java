package rekapitulacijaDO;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class DrawingFrm extends JFrame{
	public DrawingFrm() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		DrawingPnl drawingPnl = new DrawingPnl();
		getContentPane().add(drawingPnl, BorderLayout.CENTER);
		drawingPnl.setBackground(Color.WHITE);
		drawingPnl.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Point point = new Point(e.getX(), e.getY(), Color.RED);
				drawingPnl.getShapes().add(point);
			}
		});
	}
}
