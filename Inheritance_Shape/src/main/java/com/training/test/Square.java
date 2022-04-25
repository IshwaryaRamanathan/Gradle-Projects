package com.training.test;

public class Square extends Shape{

	public Square(float dim1, float dim2) {
		super(dim1, dim2);
	}

	@Override
	public void Area() {
		System.out.println("Area of Square : "+(dim1*dim1));
	}

	@Override
	public void Perimeter() {
		System.out.println("Perimeter of Square : "+(4*dim1));
	}
	
}