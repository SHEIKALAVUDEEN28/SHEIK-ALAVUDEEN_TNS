package com.tnsif.nonaccessmodifiers;

class FinalDemo {
	
	final int Var = 100;
	
	void display() {
		System.out.println("show the value of Var: "+Var);
	}

	public static void main(String[] args) {
		FinalDemo fd = new FinalDemo();
		fd.display();
		

	}

}

class Child extends FinalDemo{
	private static final String Var = null;

	void display() {
		System.out.println("show the value of Var: "+Var);
	}
}
