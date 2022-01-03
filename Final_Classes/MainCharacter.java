
// ---------------------------------------------------------------------------
// File name:MainCharacter
// Project name:SesamePokerim
// ---------------------------------------------------------------------------
// Creator’s name and email: Caleb Gibson, gibsoncd@etsu.edu
// Course-Section: 1260-001
// Creation Date: 11/10/21
// Date of Last Modification: 11/16/21
// ---------------------------------------------------------------------------

/**
 * Class Name: Main Character
 * Class Purpose: Instantiates main characters
 *
 * Date created: 11/10/21
 * Date Last Modified: 11/16/21
 * @author Caleb Gibson
 */
public class MainCharacter extends Character {
    // needs to own the current item it has, doesn't have an item until it accesses the inventory
    private ItemObject currentItemHeld = null ;
    private boolean isDead;
    // did not include health and damage because they were inherited from character
    /**
     * Method Name: MainCharacter
     * Method Purpose: constructs main character objects
     *
     * Date Created: 11/10/21
     * Date Last Modified: 11/16/21
     * @param name
     * @param damage
     * @param health
     */
    public MainCharacter(String name, double damage, double health) {
        setCharacter(name, damage, health);
    }


    /**
     * Method Name: getName
     * Method Purpose: gets value of main character's name
     *
     * Date Created: 11/10/21
     * Date Last Modified: 11/16/21
     */
    @Override
    public String getName(){
        return name;
    }
    /**
     * Method Name: getDamage
     * Method Purpose: gets value of main character's damage
     *
     * Date Created: 11/10/21
     * Date Last Modified: 11/16/21
     */
    @Override
    public  double getDamage() {
        return damage;
    }
    /**
     * Method Name: getHealth
     * Method Purpose: gets value of main character's health
     *
     * Date Created: 11/10/21
     * Date Last Modified: 11/16/21
     */
    @Override
    public double getHealth() {
        return health;
    }

    /**
     * Method Name: setHealth
     * Method Purpose: sets value of main character's health
     *
     * Date Created: 11/10/21
     * Date Last Modified: 11/16/21
     */
    public void setHealth(double health) {
        this.health = health;
    }




    /**
     * Method Name: getCurrentItemHeld
     * Method Purpose: gets current item held from inventory
     *
     * Date Created: 11/10/21
     * Date Last Modified: 11/16/21
     */
    public ItemObject getCurrentItemHeld(){
        return currentItemHeld;
    }

    /**
     * Method Name: isDead
     * Method Purpose: determines if main character is dead during the fight
     *
     * Date Created: 11/10/21
     * Date Last Modified: 11/16/21
     * @param @boolean isDead
     */
   // determine if main character is dead after being fought
    public boolean isDead(){
        if(health < 0){
            isDead = true;
        }
        else{
            isDead = false;
        }
        return isDead;
    }

}




