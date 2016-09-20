package Introduction;

public class RandomDiceRoll {
	
	public static void main(String[] args) {
		int[] results = new int [6];
		
		//declare var logic test, increment
		for(int index = 0; index < 10000; index++){
			int result = rollFairDie();
			System.out.println("Roll # " + (index+1) + ": " + result);
			results[result-1]++;
		}
		
		for(int i = 0; i < 6; i++){
			System.out.println((i+1) + " appeared " + results[i] + " times.");
		}
		
		for(int i = 0; i<10; i++){
			System.out.println(rollUnfairDie());
		}
	}

	//return 1-6 with equal probability
	public static int rollFairDie(){
		double rand = Math.random(); //returns double (0,1)
		int roll = (int) (6*rand)+1; // [1,6]
		return roll;
	}
	
	public static int rollUnfairDie(){
		double rand = Math.random();
		int roll = (int) ((rand*rand)/6);
		return roll;
	}
}
