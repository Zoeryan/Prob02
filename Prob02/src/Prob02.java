import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
public class Prob02
	{
	public static void main(String[] args) throws FileNotFoundException
		{
		int numberRed = 0;
		int numberBlack = 0;
		int clubs = 0;
		int spades = 0;
		int diamonds = 0;
		int hearts = 0;
		int twos = 0;
		int threes = 0;
		int fours = 0; 
		int fives = 0;
		int sixes = 0;
		int sevens = 0;
		int eights = 0;
		int nines = 0;
		int tens = 0;
		int jacks = 0;
		int queens = 0;
		int kings = 0;
		int aces = 0;
		int count = 0;
		
		ArrayList hand = new ArrayList();
		
		Scanner input = new Scanner(new File("Prob02.in"));
		while(input.hasNext())
			{	
			if(input.next() != " ")
				{
				String current = input.next();
				hand.add(current);
				}
			count++;
			}
			
			
		
			for(int i = 0; i < hand.size(); i++)
				{
				if(hand.get(i).toString().substring(hand.get(i).toString().length() - 1).equals("H"))
					{
					hearts++;
					numberRed++;
					if(hand.get(i).toString().substring(0 , 1).equals("2"))
						{
						twos++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("3"))
						{
						threes++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("4"))
						{
						fours++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("5"))
						{
						fives++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("6"))
						{
						sixes++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("7"))
						{
						sevens++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("8"))
						{
						eights++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("9"))
						{
						nines++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("1"))
						{
						tens++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("A"))
						{
						aces++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("J"))
						{
						jacks++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("Q"))
						{
						queens++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("K"))
						{
						kings++;
						}
					}
				if(hand.get(i).toString().substring(hand.get(i).toString().length() - 1).equals("S"))
					{
					spades++;
					numberBlack++;
					if(hand.get(i).toString().substring(0 , 1).equals("2"))
						{
						twos++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("3"))
						{
						threes++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("4"))
						{
						fours++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("5"))
						{
						fives++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("6"))
						{
						sixes++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("7"))
						{
						sevens++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("8"))
						{
						eights++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("9"))
						{
						nines++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("1"))
						{
						tens++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("A"))
						{
						aces++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("J"))
						{
						jacks++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("Q"))
						{
						queens++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("K"))
						{
						kings++;
						}
					}
				if(hand.get(i).toString().substring(hand.get(i).toString().length() - 1).equals("D"))
					{
					diamonds++;
					numberRed++;
					if(hand.get(i).toString().substring(0 , 1).equals("2"))
						{
						twos++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("3"))
						{
						threes++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("4"))
						{
						fours++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("5"))
						{
						fives++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("6"))
						{
						sixes++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("7"))
						{
						sevens++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("8"))
						{
						eights++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("9"))
						{
						nines++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("1"))
						{
						tens++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("A"))
						{
						aces++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("J"))
						{
						jacks++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("Q"))
						{
						queens++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("K"))
						{
						kings++;
						}
					}
				else
					{
					clubs++;
					numberBlack++;
					if(hand.get(i).toString().substring(0 , 1).equals("2"))
						{
						twos++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("3"))
						{
						threes++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("4"))
						{
						fours++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("5"))
						{
						fives++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("6"))
						{
						sixes++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("7"))
						{
						sevens++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("8"))
						{
						eights++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("9"))
						{
						nines++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("1"))
						{
						tens++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("A"))
						{
						aces++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("J"))
						{
						jacks++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("Q"))
						{
						queens++;
						}
					if(hand.get(i).toString().substring(0 , 1).equals("K"))
						{
						kings++;
						}
					}
				
				}
			System.out.println("Hand " + count + ":");				
			System.out.println(numberRed + " - RED");
			System.out.println(numberBlack + " - BLACK");
			System.out.println(clubs + " - CLUBS");
			System.out.println(diamonds + " - DIAMONDS");
			System.out.println(hearts + " - HEARTS");
			System.out.println(spades + " - SPADES");
			if(twos > 1)
				{
				System.out.println(twos + " - 2 cards");
				}
			else
				{
				System.out.println(twos + " - 2 card");
				}
			if(threes > 1)
				{
				System.out.println(threes + " - 3 cards");
				}
			else
				{
				System.out.println(threes + " - 3 card");
				}
			if(fours > 1)
				{
				System.out.println(fours + " - 4 cards");
				}
			else
				{
				System.out.println(fours + " - 4 card");
				}
			if(fives > 1)
				{
				System.out.println(fives + " - 5 cards");
				}
			else
				{
				System.out.println(fives + " - 5 card");
				}
			if(sixes > 1)
				{
				System.out.println(sixes + " - 6 cards");
				}
			else
				{
				System.out.println(sixes + " - 6 card");
				}
			if(sevens > 1)
				{
				System.out.println(sevens + " - 7 cards");
				}
			else
				{
				System.out.println(sevens + " - 7 card");
				}
			if(eights > 1)
				{
				System.out.println(eights + " - 8 cards");
				}
			else
				{
				System.out.println(eights + " - 8 card");
				}
			if(nines > 1)
				{
				System.out.println(nines + " - 9 cards");
				}
			else
				{
				System.out.println(nines + " - 9 card");
				}
			if(tens > 1)
				{
				System.out.println(tens + " - 10 cards");
				}
			else
				{
				System.out.println(tens + " - 10 card");
				}
			if(jacks > 1)
				{
				System.out.println(jacks + " - Jack");
				}
			else
				{
				System.out.println(jacks + " - Jack");
				}
			if(queens > 1)
				{
				System.out.println(queens + " - Queen");
				}
			else
				{
				System.out.println(jacks + " - Queen");
				}
			if(kings > 1)
				{
				System.out.println(kings + " - King");
				}
			else
				{
				System.out.println(kings + " - King");
				}
		}
	}
