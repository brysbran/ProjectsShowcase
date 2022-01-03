
public class Narration extends Randomizer {
    //Until random file is made this class will use random
    //random is only temporary for the draft, in the future everything will be fairly hardcoded with the narration relying
    //on which room you walk into. Some of the random will remain, like when you walk into dead ends.

    //Constructor that sets up the randomizer
    public Narration() {

    }

    //generic header for strings said by the narrator
    private String narrator() {
        return "Narrator: ";
    }

    //header for things said by the user
    public String user() {
        return "Oscar (You): ";
    }

    //
    public String displayStats()
    {
        return "An angry trash gremlin";
    }

    //not used yet, but this will hold the tutorial information text
    public String tutorialSpeech()
    {
        return "Elmo: Hey, you. You’re finally awake. You were trying to cross the border,\n" +
                "right? Walked right into that trash truck headed out of Sesame Street,\n " +
                "same as us, and that extra over there.\n \n" +
                "But now that you're here, I will show you the ropes";
                //"When in doubt type help"
                //"Press q at any time to quit
    }


    public String displayGeneralGettingCommand()
    {
        return "So, what are you going to do next?: ";
    }

    public String displayGeneralCommands() {
        return "Quit(q), map(m), North(n), South(s), East(e), West(w), Inventory(i)";
    }

    public String displayGettingInventoryInput() {
        return "What are you looking for?: ";
    }

    public String displayInventoryCommands() {
        return "Type the name of the item you're looking for, or, Leave Inventory(l)";
    }

    public String displayCombatCommands() {
        return "flee(f), Block(b), Attack(a)";
    }

    public String displayCombatGetterCommands() {
        return "please enter fighting command: ";
    }

    public String enemyDead() {
        return "Enemy has fallen";
    }

    public String enemyHitYou() {
        return"They have landed a hit";
    }

    public String fightingWords() {
        switch(narration()) {
            case 0:
                return user() + "Oww!\n" +
                        narrator() + "You damaged them, but hurt your pride";
            case 1:
                return user() + "Take this!";
            case 2:
                return user() + "Fear me and my harsh words!";
            case 3:
                return narrator() + "You raise your weapon menacingly, and swing";
            case 4:
                return narrator() + "You give them a mean look and they cry";
            case 5:
                return narrator() + "You rear back to give them a good wind up shot. \n" + "Then realize they're staring at you";
            case 6:
                return narrator() + "Your rage is beyond comparison \n" +
                        user() + "GIVE ME YOUR SHARD";
            case 7:
                return user() + "HAVE A MUPPET KNUCKLE SANDWHICH";
            case 8:
                return narrator() + "They take your attack to the face, then wet themselves";
            case 9:
                return narrator() + "You strike, mightily as a trash gremlin can";
            case 10:
                return narrator() + "You throw the attack, and it hits their knee";
        }

        return user() + "You're attack misses";
    }


    //this is one of the randoms that will stay, and this provides the text to print when you hit a wall
    public String blocked() {
        switch(narration()) {
            case 0:
                return user() + "Oww!\n" +
                narrator() + "How'd you manage that?";
            case 1:
                return narrator() + "You look but you find nothing but a dead end";
            case 2:
                return narrator() + "You walk absently into unforgiving stone";
            case 3:
                return narrator() + "You run into some trees blocking your path";
            case 4:
                return narrator() + "There are many obstacles in your way";
            case 5:
                return narrator() + "You thought maybe this looked right, but you are mistaken. \n" + "it was just a painting";
            case 6:
                return narrator() + "You really thought this wall had a door and even tried pushing on it to open some \n" +
                narrator() + "hidden door, seriously? :(";
            case 7:
                return narrator() + "You find nothing but an alley";
            case 8:
                return narrator() + "There are a few shops in that direction, but nothing of interest";
            case 9:
                return narrator() + "You find some dark cloaked figure lurking over there, best steer clear.";
            case 10:
                return narrator() + "this wall took an arrow to the knee";
        }

        return user() + "There must be a different way to go";
    }


    //Generic method
    public String move() {
        return "You find nothing in your way, so you continue on your way.";
    }

    //This is all the random things it could say when you move north
    public String moveNorth() {
        switch(narration())
        {
            case 0:
                return "Ever forward, never straight";
            case 1:
                return "Pressing onward";
            case 2:
                return "You venture forward";
            case 3:
                return "With confidence you move forwards to the next area to explore";
            case 4:
                return "Your curiosity takes you forwards";
            case 5:
                return "You continue on the path ahead of you";
            case 6:
                return "Focused, you stay your course";
            case 7:
                return "Your heart leads you onwards";
            case 8:
                return "You decide, after much debate, that forwards was the best idea." + " \n interesting.";
            case 9:
                return "Forward, March!";
            case 10:
                return "You stay true to your forward path";
        }

        return "You enter the next room above you";
    }

    //All the random things it could say when you move south
    public String moveSouth() {

        switch(narration())
        {
            case 0:
                return "You return to the previous room";
            case 1:
                return "You think you forgot something in another room";
            case 2:
                return "You cant remember why you came in here, and head back to retrace your steps";
            case 3:
                return "You decide its best to head back";
            case 4:
                return "You slowly back away";
            case 5:
                return "You retreat to the saftey of the familiar, the previous room";
            case 6:
                return "Not knowing where else to turn, you go back";
            case 7:
                return "You back out of the room slowly";
            case 8:
                return "Oops, didnt mean to do that";
            case 9:
                return "You turn right back around and leave";
            case 10:
                return "This didnt look right";
        }
        return "You enter the next room below you";
    }

    //all the random things it will say when you move west
    public String moveWest() {

        switch(narration())
        {
            case 0:
                return "You look to your left and trudge along in that direction";
            case 1:
                return "Westward looked like the best route to take";
            case 2:
                return "With confidence you move Westwards to the next area to explore";
            case 3:
                return "Your curiosity takes you Westwards";
            case 4:
                return "Your heart leads you Westwards";
            case 5:
                return "You decide, after much debate, that Westward was the best idea." + " \n Okay then.";
            case 6:
                return "To your left looked like a path that'd been traveled before, so you take it";
            case 7:
                return "West seemed like the best, so you travel that way";
            case 8:
                return "You travel to the left";
            case 9:
                return "You decide to turn and head West";
            case 10:
                return "West looked like a promising direction";
        }
        return "You enter the next room to the left of you";
    }

    //all the random things it will say when you move west
    public String moveEast() {

        switch(narration())
        {
            case 0:
                return "Right seemed right, so you went that way";
            case 1:
                return "You transition into the room to your right";
            case 2:
                return "You went right, right away";
            case 3:
                return "Right seemed like the path to choose";
            case 4:
                return "You realize that you want to go to the right, so you do";
            case 5:
                return "You make your way to the area on the right";
            case 6:
                return "Your curiosity takes you Eastwards";
            case 7:
                return "You decide, after much debate, that Eastward was the best idea." + "\n Why? We may never know.";
            case 8:
                return "";
            case 9:
                return "Your heart leads you Eastwards";
            case 10:
                return "";
        }
        return "You enter the next room to the Right of you";
    }


    //These are all the random things it could say when you give a wrong input. This will stay random
    public String notACommand() {
        switch(narration())
        {
            case 0:
                return "I didnt quite catch that, come again?";
            case 1:
                return "What was that you say?";
            case 2:
                return "That doesnt seem right, try again";
            case 3:
                return "How about you give that another shot";
            case 4:
                return "I know you're the grouch but no need to give up trying, use the right options next time";
            case 5:
                return "Try again please";
            case 6:
                return "Invalid Input";
            case 7:
                return "Say that again but this time correctly";
            case 8:
                return "You should give that another shot";
            case 9:
                return "Maybe proof read before hitting send";
            case 10:
                return "We are sesame street character, literally all we talk about are letters, and you still cant get \n" +
                        "this right?";
        }
        return "Invalid Input";
    }

    //announces when you enter a new level, find monster, item, equip item, or flee
    public String gotoNextFloor() {

        return "You go to the next Level";
    }

    public String monsterFound() { //finding monster and introing to fight
        return "Monster found, now fighting";
    }

    public String itemFound(String ItemName) {
        try
        {
            return ItemName + " was found";
        }
        catch (Exception e)
        {
            return "Unknown item in bagging area";
        }
    }

    public String itemEquiped(String ItemName) {

        try
        {
            return ItemName + " was equiped";
        }
        catch (Exception e)
        {
            return "Unknown item in bagging area";
        }
    }

    public String playerFlee() {
        return "successful fleeing, kicked out room";
    }
}

//can we potentially have it to where the movement into rooms and different areas can have specific dialouge?
//we could make an array in here holding all of the dialouges for going north, south, east, west, etc. and then just
//call the index of that area when it prints in game manager. but if the direction is blocked, cyle thru random text
