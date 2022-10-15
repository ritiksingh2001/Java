package CoreJava;

class Student extends Teacher{
	public void listen() {
		System.out.println("Listening to the Teacher lecture");
	}
	public static void main(String[] args)
	{
		Student s= new Student();
		s.teach();
		s.listen();
	}
}
