// ---------------------------------------------------------------------------
// File name:Character
// Project name:SesamePokerim
// ---------------------------------------------------------------------------
// Creator’s name and email: Caleb Gibson, gibsoncd@etsu.edu
// Course-Section: 1260-001
// Creation Date: 11/10/21
// Date of Last Modification: 11/16/21
// ---------------------------------------------------------------------------

/**
 * Class Name: Character
 * Class Purpose: acts as parent class for Enemy and MainCharacter, defines what they share (defined by abstract keyword)
 *
 * Date created: 11/10/21
 * Date Last Modified: 11/16/21
 * @author Caleb Gibson
 */
public abstract class Character { // too general to create objects, defines inherited design

    // protected access modifier allows accessibility along inheritance hierarchy
    protected  String name;
    protected double damage;
    protected double health;




        /**
         * Method Name: Character
         * Method Purpose: defines superclass Constructor for which subclasses use to be instantiated
         *
         * Date Created: 11/10/21
         * Date Last Modified: 11/16/21
         * @param
         */


        public void setCharacter(String name, double damage, double health){
                this.name = name;
                this.damage = damage;
                this.health = health;
        }



        /**
         * Method Name: getName
         * Method Purpose: gets value of Name for subclasses
         *
         * Date Created: 11/10/21
         * Date Last Modified: 11/16/21
         */


        public String getName() {
           return name;
        }


        /**
         * Method Name: getDamage
         * Method Purpose: gets value of damage for subclasses
         *
         * Date Created: 11/10/21
         * Date Last Modified: 11/16/21
         */
        public double getDamage () {
            return damage;
        }

        /**
         * Method Name: getHealth
         * Method Purpose: gets value of health for subclasses
         *
         * Date Created: 11/10/21
         * Date Last Modified: 11/16/21
         */
        public double getHealth () {
            return health;
        }

    /**
     * Method Name: isDead
     * Method Purpose: is not implemented because no objects of Character exists
     *
     * Date Created: 11/10/21
     * Date Last Modified: 11/24/21
     */


    // determine if main character is dead after being fought
public abstract boolean isDead();
}




