package oop.abstraction.exampleone;

public class Spider extends Animal{

	public Spider() {
		super(8);
	}
	
	@Override
	public void eat() {
		System.out.println("Spider eating...");
	}
}
