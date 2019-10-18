package com.exercise12oop.model;

public  class Square extends Shape
{
	private double side;
	
	public Square()
	{
		
	}
	
	public Square(double side)
	{
		super();
		this.side=side;
	}
	
	public double CalculateArea(double side)
    {
    	return side*side;
    }
    public double CalculatePerimeter(double side)
    {
    	return side*4;
    }
	
	public double getSide()
	{
		return side;
	}
	public void setSide(double side)
	{
		this.side=side;
	}

	@Override
	public void DoSomething() {
		// TODO Auto-generated method stub
		
	}

}
