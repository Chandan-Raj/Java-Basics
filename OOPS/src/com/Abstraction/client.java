package com.Abstraction;

 public class client extends Abst
 {
void run()
{
	System.out.println("Abstracting");
}
public static void main(String args[])
{
	client obj = new client();
	obj.run();
}
}
