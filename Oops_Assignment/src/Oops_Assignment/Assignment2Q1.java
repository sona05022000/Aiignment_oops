package Oops_Assignment;
class SingletonInheritanceCheck{
	private static SingletonInheritanceCheck singelton=new SingletonInheritanceCheck();
	private SingletonInheritanceCheck() {
		
	}
	public static SingletonInheritanceCheck getinstance() {
		System.out.println("singleton pattern");
		return singelton;
	}
	public static void demo() {
		System.out.println("demo");
	}
}

public class Assignment2Q1  {
  public static void main(String[] args) {
	  SingletonInheritanceCheck temp=SingletonInheritanceCheck.getinstance();
	   temp.demo();
	 
  }
}
//public class ChildClass extends SingletonInheritanceCheck{}
// can't be inherited