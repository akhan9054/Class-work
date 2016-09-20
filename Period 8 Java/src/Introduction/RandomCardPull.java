package Introduction;

public class RandomCardPull {
	public static void main(String[] args) {
		int ACE = 1;
		int JACK = 11;
		int QUEEN = 12;
		int KING = 13;
		String[] suits = {"Spades", "Hearts", "Clubs", "Spades"};
	}
	
	public static int pickRandomCard(){
		int rank = (Math.random()*13)+1;
		int suit = (Math.random()*4)+1;
		int[] cardArray = {rank, suit};
		return cardArray;
	}

}
