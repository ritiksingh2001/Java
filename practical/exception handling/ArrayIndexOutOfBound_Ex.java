package ExceptionHandling;

class ArrayIndexOutOfBound_Ex {

	public static void main(String[] args) 
	{ try
	{
		int arr[] = new int[5];
		arr[1] =10;
		arr[2]= 20;
		arr[3]= 30;
		arr[4]=40;
		arr[5]=50;
	}
	catch(ArrayIndexOutOfBoundsException ae) 
	{
		System.out.println("Array Index Out Of Bopund Exception Handled =>"+ae.getMessage());
	}
  }
}


