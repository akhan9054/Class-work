package Introduction;

public class Junior extends Student {
	
	private int transcriptAverage;

	public Junior(String name, int avg) {
		super(name);
		this.transcriptAverage = avg; 
	}
	
	public void talk(){
		super.talk();
		System.out.println(" and I am a junior.");
	}
	
	public void stateAverage(){
		System.out.println("My average is " + transcriptAverage);
	}
	
	

}
