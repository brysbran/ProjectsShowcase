// ---------------------------------------------------------------------------
// File name:Enemy
// Project name:SesamePokerim
// ---------------------------------------------------------------------------
// Creator’s name and email: Caleb Gibson, gibsoncd@etsu.edu
// Course-Section: 1260-001
// Creation Date: 11/10/21
// Date of Last Modification: 11/16/21
// ---------------------------------------------------------------------------

/**
 * Class Name: Enemy
 * Class Purpose: Instantiates Enemies
 *
 * Date created: 11/10/21
 * Date Last Modified: 11/16/21
 * @author Caleb Gibson
 */

public class Enemy extends Character {
    private final String levelOneEnemyA = "Bert & Ernie";
    private final String levelOneEnemyB = "Snuff";
    private final String levelTwoEnemyA = "Grover";
    private final String levelTwoEnemyB = "The Count";
    private final String levelThreeEnemyA = "Cookie Monster";
    private final String levelThreeEnemyB = "Elmo";
    private final String finalBoss = "BIG BIRD";
    //Enemy Max Damage
    private final double damageValueLevelOne = 3;
    private final double damageValueLevelTwo = 5;
    private final double damageValueLevelThree = 7;
    private final double damageValueFinalBoss = 10;
    //Enemy Max Health
    private final double healthValueLevelOne = 10;
    private final double healthValueLeveTwo = 15;
    private final double healthValueLevelThree = 20;
    private final double healthValueFinalBoss = 50;
    //creature locations
    private final int levelOnelocationEnemyAX = 1, levelOnelocationEnemyAY = 2;
    private final int levelOnelocationEnemyBX = 0, levelOnelocationEnemyBY = 3;
    private final int levelTwolocationEnemyAX = 0, levelTwolocationEnemyAY = 1;
    private final int levelTwolocationEnemyBX = 1, levelTwolocationEnemyBY = 2; 
    private final int levelThreelocationEnemyAX = 3, levelThreelocationEnemyAY = 3;
    private final int levelThreelocationEnemyBX = 1, levelThreelocationEnemyBY = 2;


    // attributes enemies have
    // did not include name, health, and damage because they were inherited from Character
    private int x;
    private int y;
    private int z;


    /**
     * Method Name: Enemy
     * Method Purpose: constructs Enemy objects
     * <p>
     * Date Created: 11/10/21
     * Date Last Modified: 11/16/21
     *
     * @param
     */
    public Enemy(String name) {
        switch(name) {
            case levelOneEnemyA:
                health = healthValueLevelOne;
                damage = damageValueLevelOne;
                x = levelOnelocationEnemyAX;
                y = levelOnelocationEnemyAY;
                z = 0;
                break;
            case levelOneEnemyB:
                health = healthValueLevelOne;
                damage = damageValueLevelOne;
                x = levelOnelocationEnemyBX;
                y = levelOnelocationEnemyBY;
                z = 0;
                break;
            case levelTwoEnemyA:
                health = healthValueLeveTwo;
                damage = damageValueLevelTwo;
                x = levelTwolocationEnemyAX;
                y = levelTwolocationEnemyAY;
                z = 1;
                break;
            case levelTwoEnemyB:
                health = healthValueLeveTwo;
                damage = damageValueLevelTwo;
                x = levelTwolocationEnemyBX;
                y = levelTwolocationEnemyBY;
                z = 1;
                break;
            case levelThreeEnemyA:
                health = healthValueLevelThree;
                damage = damageValueLevelThree;
                x = levelThreelocationEnemyAX;
                y = levelThreelocationEnemyAY;
                z = 2;
                break;
            case levelThreeEnemyB:
                health = healthValueLevelThree;
                damage = damageValueLevelThree;
                x = levelThreelocationEnemyBX;
                y = levelThreelocationEnemyBY;
                z = 2;
                break;
            case finalBoss:
                health = healthValueFinalBoss;
                damage = damageValueFinalBoss;
                //needs location
                break;
        }

        setCharacter(name, damage, health);
    }

    public String getName(){
        return name;
    }
    /**
     * Method Name: getDamage
     * Method Purpose: gets value of enemy's damage
     * <p>
     * Date Created: 11/10/21
     * Date Last Modified: 11/16/21
     */
    @Override
    public double getDamage() {
        return damage;
    }




    /**
     * Method Name: getHealth
     * Method Purpose: gets value of enemy's health
     * <p>
     * Date Created: 11/10/21
     * Date Last Modified: 11/16/21
     */
    @Override
    public double getHealth() {
        return health;
    }
    /**
     * Method Name: setHealth
     * Method Purpose: sets value of enemy's health
     * <p>
     * Date Created: 11/10/21
     * Date Last Modified: 11/16/21
     */
    public void setHealth(double health){
        this.health = health;
    }


    /**
     * Method Name: getY
     * Method Purpose: gets value of enemy's horizontal location
     * <p>
     * Date Created: 11/10/21
     * Date Last Modified: 11/16/21
     */
    public int getY() {
        return y;
    }

    /**
     * Method Name: setY
     * Method Purpose: sets value of enemy's horizontal location
     * <p>
     * Date Created: 11/10/21
     * Date Last Modified: 11/16/21
     */
    public void setY() {

    }

    /**
     * Method Name: getX
     * Method Purpose: gets value of enemy's projected location
     * <p>
     * Date Created: 11/10/21
     * Date Last Modified: 11/16/21
     */
    public int getX() {
        return x;
    }    /**
     * Method Name: setX
     * Method Purpose: sets value of enemy's projected location
     * <p>
     * Date Created: 11/10/21
     * Date Last Modified: 11/16/21
     */
    public void setX(){

    }

    /**
     * Method Name: getZ
     * Method Purpose: gets value of enemy's vertical location
     * <p>
     * Date Created: 11/10/21
     * Date Last Modified: 11/16/21
     */
    public int getZ() {
        return z;
    }    /**
     * Method Name: setZ
     * Method Purpose: sets value of enemy's vertical location
     * <p>
     * Date Created: 11/10/21
     * Date Last Modified: 11/16/21
     */
    public void setZ(){

    }

    /**
     * Method Name: isDead
     * Method Purpose: determines if main character is dead during the fight
     * <p>
     * Date Created: 11/10/21
     * Date Last Modified: 11/16/21
     */
    // determine if enemy is dead
    public boolean isDead() { //parameter is what is returned
        if (health <= 0.0) {
            return true;
        } 
        
        return false;
    }

}

