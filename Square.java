package com.shape;

public class Square implements Polygon{
	
	   float side;
	   

	public Square(float side) {
		
		this.side = side;
	}

	@Override
	public void calArea() {
		System.out.println("Area of Square is "+side*side);
		
	}

	@Override
	public void calPeri() {
		System.out.println("Perimeter of Square is "+4*side);
		
	}
		

}
