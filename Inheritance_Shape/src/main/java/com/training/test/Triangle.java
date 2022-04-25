package com.training.test;

public class Triangle extends Shape{

	public Triangle(float dim1, float dim2) {
		super(dim1, dim2);
	}

	@Override
	public void Area() {
		System.out.println("Area of Triangle : "+0.5*dim1*dim2);
	}

	@Override
	public void Perimeter() {
		System.out.println("Perimeter of Triangle : "+((2*dim1)+dim2));
	}
	
}