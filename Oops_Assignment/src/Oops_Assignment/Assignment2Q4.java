package Oops_Assignment;

abstract class Soni{}
//You can declare a class abstract without having any abstract method.
abstract class AbstractClass {
	public abstract void abstractMethod();

	public void concreteMethod() {
		System.out.println("This is a concrete method in the abstract class");
	}
}

class SubClass extends AbstractClass {
	@Override
	public void abstractMethod() {
		System.out.println("This is the implementation of the abstract method in the subclass");
	}
}

public class Assignment2Q4{
	public static void main(String[] args) {
		// AbstractClass abstractClass = new AbstractClass(); // Not allowed as the
		// class is declared abstract
		SubClass subClass = new SubClass();
		subClass.abstractMethod();
		subClass.concreteMethod();
	}
}

