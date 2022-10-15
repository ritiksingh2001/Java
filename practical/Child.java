package CoreJava;

//Child class trying to inherit two parent classes
class Child extends   ParentClass2{
 

	public static void main(String args[])
  {  
		//creating object of child class
		Child obj=new Child();  
		
		//ambiguity
      obj.text();
      obj.text1();
  }   
}
