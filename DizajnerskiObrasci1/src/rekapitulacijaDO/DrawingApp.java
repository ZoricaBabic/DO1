package rekapitulacijaDO;

import javax.swing.JFrame;

public class DrawingApp {

	public static void main(String[] args) {
		DrawingFrm drawingFrm = new DrawingFrm();
		drawingFrm.setSize(600, 400);
		drawingFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawingFrm.setVisible(true);
	}

}
