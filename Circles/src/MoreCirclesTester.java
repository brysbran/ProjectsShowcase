/**
 * ------------------------------------------------------------
 * File Name : MoreCirclesTester.java
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
 * Class Name : MoreCirclesTester
 * Class Purpose : More Circles Tester
 *
 * Date Created : 3/7/21
 * Last Modified : (Bryson Brandon, 3/7/21, brandonbc@etsu.edu)
 * @author Author's name here : Bryson Brandon
 */
public class MoreCirclesTester
{
    /**
     * Method Name : Main
     * Method Purpose : The main method, this asks the user to input the radius
     * of 3 circles and prints out the radius, diameter,
     * and area of that circle using the methods
     * created in the circle class.
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
        //sets circle A's radius to user input.
        circleA.setRadius(circleAr);

        //Takes the user input for circle B's radius
        Scanner circlerBd = new Scanner(System.in);
        System.out.print("What is the radius of Circle B?");
        //sets the variable to the user input
        double circleBr = circlerBd.nextDouble();
        //creates Circle B
        Circle circleB = new Circle(circleBr);
        //sets circle B's radius to user input.
        circleB.setRadius(circleBr);

        //Takes the user input for circle A's updated radius
        Scanner circlerAnew = new Scanner(System.in);
        System.out.print("What should circle A change to?");
        //sets the variable to the user input
        double circleAn = circlerAnew.nextDouble();
        //creates updated Circle A
        Circle circleAnr = new Circle(circleAn);
        //sets updated circle A's radius to user input.
        circleAnr.setRadius(circleAn);

        //Prints info for circle A
        System.out.println(" ");
        System.out.println("Circle A:");
        System.out.println("Radius: " + circleA.getRadius());
        System.out.println("Diameter: " + circleA.getDiameter());
        System.out.println("Area: " + circleA.getArea());


        //Prints info for circle B
        System.out.println(" ");
        System.out.println("Circle B:");
        System.out.println("Radius: " + circleB.getRadius());
        System.out.println("Diameter: " + circleB.getDiameter());
        System.out.println("Area: " + circleB.getArea());


        //Prints info for the new circle A
        System.out.println(" ");
        System.out.println("Circle A Updated:");
        System.out.println("Radius: " + circleAnr.getRadius());
        System.out.println("Diameter: " + circleAnr.getDiameter());
        System.out.println("Area: " + circleAnr.getArea());


        //Prints info for circle B
        System.out.println(" ");
        System.out.println("Circle B:");
        System.out.println("Radius: " + circleB.getRadius());
        System.out.println("Diameter: " + circleB.getDiameter());
        System.out.println("Area: " + circleB.getArea());


    }//end main method
}//end class MoreCirclesTester
