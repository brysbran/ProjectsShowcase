/**
 * ------------------------------------------------------------
 * File Name : GradeItemDriver.java
 * Project Name : Grade Item
 * ------------------------------------------------------------
 * Author's Name and  email : Bryson Brandon, brandonbc@etsu.edu
 * Course Section : 900
 * Creation Date : 3/13/21
 * Last Modified : (Bryson Brandon, 3/13/21, brandonbc@etsu.edu)
 * -------------------------------------------------------------
 */

/**
 * Class Name : GradeItem
 * Class Purpose : Establishes the class for the Grade Item methods
 *
 * Date Created : 3/13/21
 * Last Modified : (Bryson Brandon, 3/13/21, brandonbc@etsu.edu)
 * @author Author's name here : Bryson Brandon
 */
public class GradeItemDriver
{
    /**
     * Method Name :  Main
     * Method Purpose : The main method, establishes the Values for GradeType, Name, and Number Grade, and prints these
     * to the screen. It also uses the getNumberGrade, getLetterGrade, and getProperEncouragement methods.
     *
     * Date created : Mar 13, 2021
     * Date Last Modified : Mar 13, 2021
     *
     * Notes on specifications, special algorithms,
     * and assumptions: N/A
     */
    public static void main(String[] args)
    {
        GradeItem gradeItem1 = new GradeItem('Q', "Quiz1", 85);
        GradeItem gradeItem2 = new GradeItem('H', "Homework 37", 45);
        GradeItem gradeItem3 = new GradeItem('Q', "Quiz2", 99);
        GradeItem gradeItem4 = new GradeItem('H', "Homework 38", 77);

        System.out.println(gradeItem1.getProperEncouragement());
        System.out.println(gradeItem1.getNumberGrade());
        System.out.println(gradeItem1.getLetterGrade());
        System.out.println(gradeItem2.getProperEncouragement());
        System.out.println(gradeItem2.getLetterGrade());
        System.out.println(gradeItem3.getProperEncouragement());
        System.out.println(gradeItem4.getProperEncouragement());

    }//ends main method
}//ends class GradeItemDriver
