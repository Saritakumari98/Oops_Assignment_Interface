package com.shape;


public class Rectangle implements Polygon
{
     float length;
     float breadth;
     
	public Rectangle(float length, float breadth) {
		
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void calArea() {
		System.out.println("Area of Rectangle is "+length*breadth);
		
	}

	@Override
	public void calPeri() {
		System.out.println("Perimeter of Rectangle is "+2*(length+breadth));
		
	}
	
}
