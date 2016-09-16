package Introduction;

public class Senior extends Student {

	public Senior(String name) {
		super(name); //creates Student first
	}
	
	public void talk(){
		super.talk();
		System.out.println(" and I am a senior.");
	}

}
