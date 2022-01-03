/**
 * ------------------------------------------------------------
 * File Name : GradeItem.java
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
public class GradeItem
{
    private char gradeType;
    private String name;
    private double numberGrade;


    /**
     * Method Name :  GradeItem
     * Method Purpose : This Creates the default constructor for Grade Item
     *
     * Date created : Mar 13, 2021
     * Date Last Modified : Mar 13, 2021
     *
     * Notes on specifications, special algorithms,
     * and assumptions: N/A
     */
    public GradeItem(char gradeType, String name, double numberGrade) {
        this.gradeType = gradeType;
        this.name = name;
        this.numberGrade = numberGrade;
    }//end method GradeItem


    /**
     * Method Name : setGradeType
     * Method Purpose : sets the grade type
     *
     * Date created : Mar 13, 2021
     * Date Last Modified : Mar 13, 2021
     *
     * Notes on specifications, special algorithms,
     * and assumptions: N/A
     */
    public void setGradeType(char gradeType)
    {
        this.gradeType = gradeType;
    }//end method setGradeType


    /**
     * Method Name : getGradeType
     * Method Purpose : Calls the value of the grade type
     *
     * Date created : Mar 13, 2021
     * Date Last Modified : Mar 13, 2021
     *
     * Notes on specifications, special algorithms,
     * and assumptions: N/A
     */
    public char getGradeType()
    {
        return gradeType;
    }//end method getGradeType


    /**
     * Method Name : setName
     * Method Purpose : Sets the name of the assigment
     *
     * Date created : Mar 13, 2021
     * Date Last Modified : Mar 13, 2021
     *
     * Notes on specifications, special algorithms,
     * and assumptions: N/A
     */
    public void setName(String name)
    {
        this.name = name;
    }//end method setName


    /**
     * Method Name : getName
     * Method Purpose : Calls the string set to name.
     *
     * Date created : Mar 13, 2021
     * Date Last Modified : Mar 13, 2021
     *
     * Notes on specifications, special algorithms,
     * and assumptions: N/A
     */
    public String getName()
    {
        return name;
    }//ends method getName


    /**
     * Method Name : setNumberGrade
     * Method Purpose : sets the number grade
     *
     * Date created : Mar 13, 2021
     * Date Last Modified : Mar 13, 2021
     *
     * Notes on specifications, special algorithms,
     * and assumptions: N/A
     */
    public void setNumberGrade(double numberGrade)
    {
        this.numberGrade = numberGrade;
    }//ends method setNumberGrade


    /**
     * Method Name : getNumberGrade
     * Method Purpose : Gets the value assigned to numberGrade
     *
     * Date created : Mar 13, 2021
     * Date Last Modified : Mar 13, 2021
     *
     * Notes on specifications, special algorithms,
     * and assumptions: N/A
     */
    public double getNumberGrade()
    {
        return numberGrade;
    }//ends method getNumberGrade

    /**
     * Method Name : getLetterGrade
     * Method Purpose : Converts the value of number grade to a String based on certain criteria.
     *
     * Date created : Mar 13, 2021
     * Date Last Modified : Mar 13, 2021
     *
     * Notes on specifications, special algorithms,
     * and assumptions: N/A
     */
    public String getLetterGrade()
    {
        String empty = " ";
        if (numberGrade >= 93) {
            System.out.println("Letter Grade = A");
        } else if (numberGrade >= 90) {
            System.out.println("Letter Grade = A-");
        } else if (numberGrade >= 87) {
            System.out.println("Letter Grade = B+");
        } else if (numberGrade >= 84) {
            System.out.println("Letter Grade = B");
        } else if (numberGrade >= 80) {
            System.out.println("Letter Grade = B-");
        } else if (numberGrade >= 77) {
            System.out.println("Letter Grade = C+");
        } else if (numberGrade >= 74) {
            System.out.println("Letter Grade = C");
        } else if (numberGrade >= 70) {
            System.out.println("Letter Grade = C-");
        } else if (numberGrade >= 60) {
            System.out.println("Letter Grade = D");
        } else {
            System.out.println("Letter Grade = F");
        }
    return empty;
    }//ends method getLetterGrade


    /**
     * Method Name : getGradeTypeAsAString
     * Method Purpose : Uses a switch method to convert the chars of 'Q', 'H', and default to display "Homework", "Exam",
     * or "Quiz"
     *
     * Date created : Mar 13, 2021
     * Date Last Modified : Mar 13, 2021
     *
     * Notes on specifications, special algorithms,
     * and assumptions: N/A
     */
        public String getGradeTypeAsAString()
        {
            String type = "";

            switch (gradeType) {
                case 'Q':
                    type = "Quiz";
                    break;
                case 'H':
                    type = "Homework";
                    break;
                default:
                    type = "Exam";
                    break;

            }
            return type;

        }//ends method getGradeTypeAsAString


    /**
     * Method Name : getProperEncouragement
     * Method Purpose : Displays a certain message based on the score entered.
     *
     * Date created : Mar 13, 2021
     * Date Last Modified : Mar 13, 2021
     *
     * Notes on specifications, special algorithms,
     * and assumptions: N/A
     */
        public String getProperEncouragement()
        {
            if(numberGrade >= 90)
            {
                return "Amazing!";
            }
            else if(numberGrade >= 80)
            {
                return "Great Work!";
            }
            else if(numberGrade >= 70)
            {
                return "Need Help?";
            }
            else if(numberGrade >= 60)
            {
                return "Needs Improvement...";
            }
            else
            {
                return "See me...";
            }

        }//ends method getProperEncouragement
    }//ends GradeItem class.

