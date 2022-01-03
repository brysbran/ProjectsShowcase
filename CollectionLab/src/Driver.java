public class Driver {
    public static void main(String[] args) {

        String[] elements = new String[]{"Light", "Dark", "Fire", "Cold"};
        String[] creatures = new String[]{"Slime", "Horse", "Badger", "Unicorn", "Hippo", "Weasel"};

        Deck firstDeck = new Deck(elements.length * creatures.length);//sets length of firstDeck

        //nested loops to populate deck
        for(int i = 0; i < elements.length; i++)
        {
            for(int b = 0; b < creatures.length; b++)
            {
                Card tempCard = new Card();
                tempCard.setCreatureType(creatures[b]);
                tempCard.setElementalDmgType(elements[i]);
                firstDeck.add(tempCard);
            }
        }
                //prints first deck, deals, prints 2nd deck
                firstDeck.printDeck();
                firstDeck.deal(creatures.length);

                Deck secondDeck = new Deck(firstDeck);
                secondDeck.printDeck();

    }//end main method
}//end class