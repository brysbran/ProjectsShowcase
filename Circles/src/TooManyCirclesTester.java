/**
 * ------------------------------------------------------------
 * File Name : TooManyCirclesTester.java
 * Project Name : Lab 3
 * ------------------------------------------------------------
 * Author's Name and  email : Bryson Brandon, brandonbc@etsu.edu
 * Course Section : 900
 * Creation Date : 3/6/21
 * Last Modified : (Bryson Brandon, 3/7/21, brandonbc@etsu.edu)
 * -------------------------------------------------------------
 */
import java.util.Scanner;
/**
 * Class Name : TooManyCirclesTester
 * Class Purpose : Too Many Circles Tester
 *
 * Date Created : 3/7/21
 * Last Modified : (Bryson Brandon, 3/7/21, brandonbc@etsu.edu)
 * @author Author's name here : Bryson Brandon
 */
public class TooManyCirclesTester
{
    /**
     * Method Name : Main
     * Method Purpose : The main method, Like the MoreCirclesClass, this class asks the user
     * the radius of 3 circles, and displays the information using the getInfo method
     * in the Circle class.
     *
     * Date created : Mar 7, 2021
     * Date Last Modified : Mar 7, 2021
     *
     * Notes on specifications, special algorithms,
     * and assumptions: N/A
     *
     *
     * @param args
     * @returns void
     *
     */
    public static void main(String[] args)
    {

//Takes the user input for circle A's radius
        Scanner circlerAd = new Scanner(System.in);
        System.out.print("What is the radius of Circle A?");
        //sets the variable to the user input
        double circleAr = circlerAd.nextDouble();
        //creates Circle A
        Circle circleA = new Circle(circleAr);
        //sets the circles Name
        circleA.setName("Circle A");
        //sets circle A's radius to user input.
        circleA.setRadius(circleAr);

        //Takes the user input for circle B's radius
        Scanner circlerBd = new Scanner(System.in);
        System.out.print("What is the radius of Circle B?");
        //sets the variable to the user input
        double circleBr = circlerBd.nextDouble();
        //creates Circle B
        Circle circleB = new Circle(circleBr);
        //sets the circles name.
        circleB.setName("Circle B");
        //sets circle B's radius to user input.
        circleB.setRadius(circleBr);

        //Takes the user input for circle A's updated radius
        Scanner circlerAnew = new Scanner(System.in);
        System.out.print("What should circle A change to?");
        //sets the variable to the user input
        double circleAn = circlerAnew.nextDouble();
        //creates updated Circle A
        Circle circleAnr = new Circle(circleAn);
        //sets the circles name.
        circleAnr.setName("Updated Circle A");
        //sets updated circle A's radius to user input.
        circleAnr.setRadius(circleAn);




        //gives the info using the getInfo method
        circleA.getInfo();
        circleB.getInfo();
        circleAnr.getInfo();


    }//end method Main
}//end class TooManyCirclesTester
