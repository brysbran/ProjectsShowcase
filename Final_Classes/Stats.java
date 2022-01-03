//implements all the data values from these files
public class Stats
{
        // hold the variables I use for the display values
    private Events event;
    private Narration narration;
    private String characterName;
    private double overallDamageTaken;
    private double overallDamageGiven;
    private static String description;
    private double currentDmg;
    private int characterDefense;
    private int floor;
    private int roomX;
    private int roomY;
    private double enemyHealth;
    private double enemyDamage;

    public Stats(Events event) {
        this.event = event;
        narration = new Narration();
    }

    public void refreshStats() {
        //collects position from CharacterMovement

        roomX = event.getMovement().getCurrentPlayerPositionX();
        roomY = event.getMovement().getCurrentPlayerPositionY();
        floor = event.getMovement().getCurrentPlayerPositionLevel();


        //collects enemy Health and Dmg(will be used to collect overall damage and given)
        enemyHealth = event.getRoom().getEnemyInforamtion().getHealth();
        enemyDamage = event.getRoom().getEnemyInforamtion().getDamage();

        if(event.getInventory().getCurrentItemHeld() != null) {
            currentDmg = event.getMainCharacter().damage + event.getInventory().getCurrentItemHeld().getDmg();
        }
        else {
            currentDmg = event.getMainCharacter().damage;
        }

        //gets users Name and Description from Narration
        characterName = narration.user();
        description = narration.displayStats();

        mathFunction();
    }



    private void mathFunction() {


        //Enemy File(collects the damage the enemy does and calculates it to the total damage taken)
        overallDamageTaken = enemyDamage + 0;


        //Enemy File(collects the enemy health to figure out how much damage is given when the enemy dies)
        overallDamageGiven = (-enemyHealth) * -1;

        //Displays characters Defense value depending on item held
        //SHIELD NEEDS TO BE IMPLEMENTED IN ITEMS(will be done)
        if(event.getInventory().getItemHeld().equals("shield")) 
            characterDefense = 100;
        else
            characterDefense = 25;

    }

    private String breakLine() {
        return "-------------------------------------------------------------------\n";
    }

    public String output(){
        //Pint lines that display the values when Stats is called
        return breakLine() + "Your current Stats for this run are Name: " + characterName  + "\nCharacter Description: " + description +
        "\nDamage Given: " + overallDamageGiven
        + "\nDamage Taken: " + overallDamageTaken + "\nCurrent Attack Power: " + currentDmg + "\nCurrent Defense: "+ characterDefense + 
        "\nYour current position is Floor: " + floor + " Room: " + roomX +","+ roomY;

    }


}