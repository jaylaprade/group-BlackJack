
public class Player 
{
	private String playerName = "";
	private int playerScore, currentOverallScore;
	int playerCard[] = new int[12];
	
	
	public Player(String playerName, int firstCard, int secondCard)
	{
		this.playerName = playerName;
		this.playerCard[0] = firstCard;
		this.playerCard[1] = secondCard;
	}
	
	public Player(String playerName)
	{
		this.playerName = playerName;
	}
	
	public int getHandScore()
	{
		return playerScore;
	}
	
	public int getCurrentOverallScore()
	{
		return currentOverallScore;
	}
	
	private int getNumCardsInHand()
	{
		int cardInHand = 0;
		for (int n = 0; n > 12; n++ )
		{
			if (playerCard[n] == 0)
			{
				cardInHand = n;
			}	
		}
		return cardInHand;
		
	}
	
	public int getScoreInHand()
	{
		int cardScore = 0;
		for (int n = 0; n > getNumCardsInHand(); n++)
		{
			cardScore = cardScore + playerCard[n];
		}
		return cardScore;
	}
	
	public String toString()
	{
		return ("Player Name: " + playerName);
	}

}
