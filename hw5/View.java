import javax.swing.*;
import java.awt.*;
import java.util.*;

public class View extends JPanel implements Observer
{
	private Grid gridModel;
	
	public View (Grid grid) {
		
		
		this.gridModel = grid;
		
		paintComponent(this);
		
		addMouseListener(this);
		
		gridModel.addObserver(this);
		
		this.addMouseListener(gridModel);
		
		add(gridModel);
	}
	
	
	private void mouseClicked(MouseEvent e) {
		eventOutput(gridModel.swapStates(), e);
	}
  
	private void paintComponent(Graphics g) {
		if (gridModel.cellIsAlive(i,j)) {
			g.setColor(Color.WHITE);
			g.fillRect(j*cellSize, i*cellSize, cellSize, cellSize);
		}
	}
	
	private void eventOutput() {
        gridModel.setCellAlive(, , !(cellIsAlive(, )));
    }

}