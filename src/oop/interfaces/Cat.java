package oop.interfaces;

public class Cat extends Animal implements Pet{
	private String name;
	
	public Cat() {
		super(4);
	}
	
	public Cat(String name) {
		this();
		this.name = name;
	}
	
	@Override
	public void eat() {
		System.out.println("Cat eating...");
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void play() {
		System.out.println("Cat playing...");
	}
	
}
