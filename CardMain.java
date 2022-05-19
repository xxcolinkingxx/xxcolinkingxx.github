class CardMain {
  public static void main(String[] args) {
    DeckOfCards deck=new DeckOfCards();
        for(int i=deck.size(); i>0; i--){ 
            System.out.println(deck.deal());
            deck.shuffle();
          }
  }
}
/*
The 2 of Clubs
The 7 of Diamonds
The King of Spades
The 7 of Spades
The 5 of Hearts
The 8 of Diamonds
The Queen of Diamonds
The 3 of Spades
The 8 of Spades
The 10 of Clubs
The 2 of Diamonds
The 2 of Spades
The Ace of Spade
The Ace of Diamonds
The 2 of Hearts
The Jack of Hearts
The 4 of Spades
The Ace of Hearts
The 7 of Clubs
The 10 of Hearts
The Queen of Hearts
The 3 of Clubs
The 10 of Spades
The Ace of Clubs
The 5 of Diamonds
The 6 of Diamonds
The Queen of Spades
The Jack of Diamonds
The 9 of Diamonds
The 3 of Hearts
The Queen of Clubs
The 8 of Hearts
The King of Hearts
The Jack of Spades
The King of Diamonds
The 3 of Diamonds
The 5 of Spades
The 8 of Clubs
The 9 of Spades
The 4 of Diamonds
The 4 of Hearts
The 6 of Spades
The 4 of Clubs
The 6 of Clubs
The 6 of Hearts
The 9 of Clubs
The 9 of Hearts
The 7 of Hearts
The King of Clubs
The 5 of Clubs
The Jack of Clubs
The 10 of Diamonds
  */