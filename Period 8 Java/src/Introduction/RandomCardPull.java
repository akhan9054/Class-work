package Introduction;

public class RandomCardPull {
	public static void main(String[] args) {
		String[] suits = {"Spades", "Hearts", "Clubs", "Spades"};
		
		int cardInfo = pickRandomCard();
		
		System.out.println(cardInfo[0] + " of " + suits[cardInfo[1]]);
	}
	
	public static int pickRandomCard(){
		int rank = (Math.random()*13)+1;
		int suit = (Math.random()*4)+1;
		int[] cardArray = {rank, suit};
		return cardArray;
	}

}
