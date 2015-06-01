package interp;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.lang.Math;
import java.lang.InterruptedException;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Display extends JPanel {
	
	private boolean positioned = false;
	
  private float rX = -1.0f;

	private float rY = -1.0f;
	
	private float rRot = 0.0f;

	private boolean rTrail = false;
	
	private static final float ENV_SIZE = 50.0f;
		
	private static final float R_SIZE = 2.0f;
	
  private static final int R_OFFSET = 10;
	
	private ArrayList<Obstacle> obsList = new ArrayList<Obstacle>();
	
	private class Position {
		public float x;		
		public float y;
	}
	
	private ArrayList<Position> positions = new ArrayList<Position>();
	
	private static final float D_SPEED = 0.5f;
	
	private Graphics2D g2d;


	public void updatePos(float X, float Y, float Rot) {
		rX = X; rY = Y; rRot = Rot;
		Position pos = new Position();
		pos.x = X; pos.y = Y;
		positions.add(pos);
		repaint();
  }
  
  public void addObs(Obstacle obs) {
  	obsList.add(obs);
  	repaint();
  }
  
  public void setPositioned(boolean p) {
  	positioned = p;
  }
  
  public void setTrail(boolean t) {
  	rTrail = t;
  }

	private void drawRobot() {
		g2d.setColor(Color.DARK_GRAY);
		g2d.fillOval(f2p(rX)-R_OFFSET, f2p(rY)-R_OFFSET, f2ps(R_SIZE), f2ps(R_SIZE));
		g2d.setColor(Color.GREEN);
		float nX = rX + R_SIZE/2.0f * (float)Math.cos(Math.toRadians((double)rRot));
		float nY = rY + R_SIZE/2.0f * (float)Math.sin(Math.toRadians((double)rRot));
		g2d.drawLine(f2p(rX), f2p(rY), f2p(nX), f2p(nY));
	}
	
	private void drawObstacle(Obstacle obs) {
		g2d.setColor(Color.RED);
		g2d.fillRect(f2p(obs.X-(obs.sizeX/2.0f)), f2p(obs.Y-(obs.sizeY/2.0f)), f2ps(obs.sizeX), f2ps(obs.sizeY));
	}
  
  private int f2p(float n) {
  	return ((int)(n*10)) + 10;
  }
  
  private int f2ps(float n) {
  	return ((int)(n*10));
  }
  
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(Color.BLACK);
		g2d.fillRect(0, 0, 520, 520);
		g2d.setColor(Color.WHITE);
		g2d.fillRect(10, 10, 500, 500);
		
		try {
			Thread.sleep(1);
		} catch (InterruptedException ex) { }
		
		for (Obstacle curr : obsList) {
			drawObstacle(curr);
		}
		
		if (rTrail) {
			if (positions.size() <= 1);
			else {
				g2d.setColor(Color.BLUE);
				for (int i = 0; i < positions.size() - 1; ++i) {
					Position pos1 = positions.get(i);
					Position pos2 = positions.get(i+1);
					g2d.drawLine(f2p(pos1.x),f2p(pos1.y),f2p(pos2.x),f2p(pos2.y));
				}
			}
		}
		
		if (positioned) drawRobot();
		
	}
	
}

