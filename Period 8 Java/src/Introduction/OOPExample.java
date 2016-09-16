package Introduction;

public class OOPExample {
	public static void main(String[] args) {
		Student jillian = new Senior("Jillian");
		Student jordan = new Junior("Jordan", 100);
		Student joseph = new Freshman("Jordan", true);
		
		jillian.talk();
		jordan.talk();
		((Junior)jordan).stateAverage();
		joseph.talk();
	}

}
