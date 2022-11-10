package ExceptionHandling;
class AirthmeticException_Ex {
   public static void main(String[] args) 
	{
	   try {
	   int a = 10/0;
	   System.out.println(a);
	   }
	   catch(ArithmeticException ae)
	   {
	   	System.out.println("Airthmetic Exception Handled =>"+ae.getMessage());
	   }
     }
}
