package _05_Polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    protected int x;
    protected int y;
    private int width;
    private int height;
    
    public Polymorph(int x, int y, int width, int height){
   	 this.x = x;
   	 this.y = y;
   	 this.width = width;
   	 this.height = height;
    }
    
    public abstract void update(int i, int j);
    
    public abstract void draw(Graphics g);
    
    public void setX(int num) {
    	x = num;
    }
    
    public void setY(int num) {
    	y = num;
    }
    
    public void setWidth(int num) {
    	width = num;
    }
    
    public void setHeight(int num) {
    	height = num;
    }
    
    public int getX() {
    	return x;
    }
    
    public int getY() {
    	return y;
    }
    
    public int getWidth() {
    	return width;
    }
    
    public int getHeight() {
    	return height;
    }

	public void update() {
		// TODO Auto-generated method stub
		
	}
}
