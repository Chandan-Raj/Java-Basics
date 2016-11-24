package com.constructorchaining;

public class Const
{
	int id;
	String name;
	
	Const(int i,String n)
	{
		this.id = i;// invoking constructor
		this.name = n;//invoking constructor
		
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
}
