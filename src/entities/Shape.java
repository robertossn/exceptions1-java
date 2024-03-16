package entities;

import entities.enums.Color;

public abstract class Shape {

	private  Color Color;

	public Shape() {
		
	}
	
	
	public Shape(Color color) {
		this.Color = color;
	}


	public Color getColor() {
		return Color;
	}

	public void setColor(Color color) {
		Color = color;
	}
	
	public abstract double area();
}
