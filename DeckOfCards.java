import java.util.ArrayList;
import java.util.Random;


public class DeckOfCards {
    private ArrayList<Card> deck= new ArrayList<>();


    public DeckOfCards(){
        for(int i=2; i<=10; i++){
            deck.add(new Card(Integer.toString(i),"Clubs"));
            deck.add(new Card(Integer.toString(i),"Hearts"));
            deck.add(new Card(Integer.toString(i),"Spades"));
            deck.add(new Card(Integer.toString(i),"Diamonds"));
        }
        deck.add(new Card("Ace","Clubs"));
        deck.add(new Card("Ace","Hearts"));
        deck.add(new Card("Ace","Spade"));
        deck.add(new Card("Ace","Diamonds"));
        deck.add(new Card("Jack","Clubs"));
        deck.add(new Card("Jack","Hearts"));
        deck.add(new Card("Jack","Spades"));
        deck.add(new Card("Jack","Diamonds"));
        deck.add(new Card("Queen","Clubs"));
        deck.add(new Card("Queen","Hearts"));
        deck.add(new Card("Queen","Spades"));
        deck.add(new Card("Queen","Diamonds"));
        deck.add(new Card("King","Clubs"));
        deck.add(new Card("King","Hearts"));
        deck.add(new Card("King","Spades"));
        deck.add(new Card("King","Diamonds"));
    }


    public Card deal(){
        return deck.remove(0);
    }

    public int size(){
        return deck.size();
    }

     
    public void shuffle(){
        ArrayList<Card> temp= new ArrayList<>();
        Random rand=new Random();
        for(int i=deck.size(); i>0; i--){
            temp.add(deck.remove(rand.nextInt(i)));
        }
        deck=temp;
    }
}
