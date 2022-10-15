package CoreJava;
		class Dog extends Animal
		{ 
		// methods and fields of Animals 
		 //methods and fields of Dogs

		public void display(){
		System.out.println("my name is:  " + name);} 
		public static void main(String[] args)
		{
                  //creating a object of sub-class 
		  Dog ab= new Dog();

		//accessing fields of superclass
		 ab.name="bulldog";
		ab.display();
		//call method of superclass using object of subclass 
		ab.eat();
		}



	}


