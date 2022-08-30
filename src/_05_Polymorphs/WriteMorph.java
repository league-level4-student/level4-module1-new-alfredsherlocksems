package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;

public class WriteMorph extends Polymorph{

	public WriteMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(x, y, getWidth(), getHeight());
	}

  
    public void update() {
        JOptionPane.showMessageDialog(null, "hi");
    }

	@Override
	public void update(int i, int j) {
		// TODO Auto-generated method stub
		
	}
	
}
