package com.training.test;

public class Circle extends Shape {

	float pi=3.14f;
	
	public Circle(float dim1, float dim2) {
		super(dim1, dim2);
	}

	@Override
	public void Area() {
		System.out.println("Area of Circle : "+pi*dim1*dim1);
	}

	@Override
	public void Perimeter() {
		System.out.println("Perimeter of Circle : "+2*pi*dim1);
	}
	
}
