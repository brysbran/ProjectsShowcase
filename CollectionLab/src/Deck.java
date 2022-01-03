public class Deck
{
    private Card[] cards;
    private boolean[] dealt;
    private int capacity;
    private int cardsInDeck;


    public void setCapacity()//sets default capacity
    {
        capacity = 30;
    }

    public Deck(int capacity)//initializes deck
    {
        cards = new Card[capacity];
        dealt = new boolean[capacity];
        this.capacity = capacity;
    }

    public Deck(Deck deck)//copies deck of cards
    {
        this.capacity = deck.capacity;
        this.cardsInDeck = deck.cardsInDeck;
        this.cards = new Card[deck.capacity];
        this.dealt = new boolean[capacity];

        for(int i = 0; i < cardsInDeck; i++)
        {
            String tempCreatureType = " ";
            String tempElementalDmgType = " ";
            Card tempCard = new Card();
            tempCard.setCreatureType(tempCreatureType);
            tempCard.setElementalDmgType(tempElementalDmgType);
            this.cards[i] = tempCard;
        }
    }

    public void add(Card card)//adds card to the deck
    {
        if(cardsInDeck <= capacity)
        {
            cards[cardsInDeck] = card;
            cardsInDeck++;
        }

    }

    public void deal(int dealNum)//accepts integer index, marks as dealt
    {
        this.dealt = new boolean[cardsInDeck];
        dealt[dealNum] = true;
    }

    public void returnToDeck(int dealNum)//accepts integer index, marks it as not dealt.
    {
        dealt[dealNum] = false;
    }

    public void printDeck()
    {

        for(int i = 0; i < cardsInDeck; i++)
        {


            System.out.println("Creature Type: " + cards[i].getCreatureType());
            System.out.println("Elemental Damage Type: " + cards[i].getElementalDmgType());
            System.out.println("Defense: " + cards[i].getDefStrength());
            System.out.println("Attack: " + cards[i].getAtkStrength());
            System.out.println("Dealt: " + dealt[i]);
            System.out.println("---------");

        }
        System.out.println("----------------------------------------------");
    }







}
