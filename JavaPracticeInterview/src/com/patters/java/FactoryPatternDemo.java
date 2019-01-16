package com.patters.java;

public class FactoryPatternDemo {

	public static void main(String[] args)
	{
		ShapeFactory sp= new ShapeFactory();
		
		Shape shape1= sp.getShape("CIRCLE");
		Shape shape2= sp.getShape("SQUARE");
		Shape shape3= sp.getShape("RECTANGLE");
		
		shape1.draw();
		shape2.draw();
		shape3.draw();
	}

}
