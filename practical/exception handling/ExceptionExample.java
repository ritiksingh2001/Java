package ExceptionHandling;

class ExceptionExample {

	public static void main(String[] args) {
		try
		{
			int a[]=new int[5];
			a[5]=30/0;
			System.out.println(a[10]);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic Exception occur" );
		}
		catch(ArrayIndexOutOfBoundsException aeb)
		{
			System.out.println("Array Exception occur" );
		}
		catch(Exception e)
		{
			System.out.println("parent Exception occur" );
		}
	}
}
