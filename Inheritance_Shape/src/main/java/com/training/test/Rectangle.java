package com.training.test;

public class Rectangle extends Shape{

	public Rectangle(float dim1, float dim2) {
		super(dim1, dim2);
	}

	@Override
	public void Area() {
		System.out.println("Area of Rectangle : "+(dim1*dim2));
	}

	@Override
	public void Perimeter() {
		System.out.println("Perimeter of Rectangle : "+2*(dim1+dim2));
	}
	
}