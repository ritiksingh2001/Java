// main class in which methods of both class parent and child getting called
package CoreJava;

class Inheritance extends Child{
    public static void main(String[] args)
	{  //creating the object of Child class in main class 
		Child ih= new Child();
		//calling the methods of sub-class in main class using object 
		ih.sing();
		ih.speak();
		ih.dance();
	}
}
