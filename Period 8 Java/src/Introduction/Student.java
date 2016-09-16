package Introduction;

public class Student {
	//fields
	private String name;
	
	//constructor (initializes fields)
	public Student(String name){
		this.name = name;
	}
	
	public void talk(){
		System.out.println("Hello, my name is " + name);
	}
}
