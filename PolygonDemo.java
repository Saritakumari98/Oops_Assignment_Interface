package com.test;
import java.util.Scanner;

import com.shape.*;
public class PolygonDemo {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of square:");
		float side=sc.nextFloat();

		Square sq=new Square(side);
		sq.calArea();
		sq.calPeri();

		System.out.println();

		System.out.println("Enter the Length of Rectangle:");
		float length=sc.nextFloat();

		System.out.println("Enter the breadth of Rectangle:");
		float breadth=sc.nextFloat();
		sc.close();

		Rectangle rectangle=new Rectangle(length,breadth);
		rectangle.calArea();
		rectangle.calPeri();

	}

}
