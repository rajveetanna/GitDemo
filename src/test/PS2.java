package test;

public class PS2 extends PS3 {

	// Class variable
	int a;

	// Default constructor
	public PS2(int a) // Instance variable 
	{
		// By calling super keyword your parent class constructor is invoked
		// Super keyword used in only inheritance
		// It should be first line of your child constructor before doing any operation of your own constructor
		super(a);
		// this.a refers to current class variable
		// this keyword
		this.a = a;
	}

	public int increment() {
		a = a + 1;
		return a;
	}

	public int decrement() {
		a = a - 1;
		return a;
	}

}
