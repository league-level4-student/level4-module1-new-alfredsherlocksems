package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph{

	public MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x, y, getWidth(), getHeight());
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		if (x < 480) {
			x+=10;
		}
		else {
			x-=470;
		}
		
	}

	@Override
	public void update(int i, int j) {
		// TODO Auto-generated method stub
		
	}

}
