package Introduction;

public class Freshman extends Student {
	
	private boolean goodWithDirections;

	public Freshman(String name, boolean directions) {
		super(name);
		this.goodWithDirections = directions;
	}

	public void talk(){
		super.talk();
		
		if(goodWithDirections){
			System.out.println(" and I am a freshman that will know my way around.");
		}
		else{
			System.out.println(" and I am a freshman that has directional senses as good as Columbus.");
		}
	}

}
