package entities;

import entities.enums.Color;

public class Rectangle extends Shape{
	private double height;
	private double width;
	
	public Rectangle() {
		
	}
	
	public Rectangle(Color color, double height, double width) {
		super(color);
		this.height = height;
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	//A classe que não é abstrata é obrigada a sobrescrever o método abstrato herdado
	@Override
	public double area() {
		return height * width;
	}
	
}
