/**
 * ------------------------------------------------------------
 * File Name : CircleTester.java
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
 * Class Name : Circle Tester
 * Class Purpose : Circle Tester
 *
 * Date Created : 3/7/21
 * Last Modified : (Bryson Brandon, 3/7/21, brandonbc@etsu.edu)
 * @author Author's name here : Bryson Brandon
 */
public class CircleTester
{
    /**
     * Method Name : Main
     * Method Purpose : The main method, this asks the user to input the radius of a circle
     * and prints out the radius, diameter, and area of that circle.
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


        System.out.print("What is the radius of this circle? ");

        //creates scanner for user input
        Scanner radcir = new Scanner(System.in);

        //sets the radius of circle to user input
        double cir1Radius = radcir.nextDouble();

        //creates circle object
        Circle circleA = new Circle(cir1Radius);
        //sets circleA radius to user input
        circleA.setRadius(cir1Radius);


        System.out.println("Circle A: ");
        //prints the radius.
        System.out.println("Radius: " + circleA.getRadius());
        //prints the diameter.
        System.out.println("Diameter: " + circleA.getDiameter());
        //prints the area.
        System.out.println("Area: " + circleA.getArea());














    }//end main method
}//end class CircleTester
