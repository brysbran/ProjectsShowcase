/**
 * ------------------------------------------------------------
 * File Name : TriangleTester.java
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
 * Class Name : TriangleTester
 * Class Purpose : Tests the Triangle Class
 *
 * Date Created : 3/7/21
 * Last Modified : (Bryson Brandon, 3/7/21, brandonbc@etsu.edu)
 * @author Author's name here : Bryson Brandon
 */
public class TriangleTester
{
    /**
     * Method Name : Main
     * Method Purpose : The Main method, this tests the Triangle class by displaying the information
     * of a certain triangle.
     *
     * Date created : Mar 7, 2021
     * Date Last Modified : Mar 7, 2021
     *
     * Notes on specifications, special algorithms,
     * and assumptions: N/A
     * */
    public static void main(String[] args)
    {
        //creates the local doubles for side A and side B
        double siderA;
        double siderB;


        //creates the scanner to take the user input for side A, and stores it in the local variable.
        Scanner trianglesideA = new Scanner(System.in);
        System.out.println("What is the length of side A? ");
        siderA = trianglesideA.nextDouble();

        // //creates the scanner to take the user input for side A, and stores it in the local variable.
        Scanner trianglesideB = new Scanner(System.in);
        System.out.println("What is the length of side B? ");
        siderB = trianglesideB.nextDouble();

        //creates the triangle object and sets the sides equal to the user input.
        Triangle triangle1 = new Triangle(siderA, siderB);
        triangle1.setSideA(siderA);
        triangle1.setSideB(siderB);



        //uses the getInfo method to display the triangles information.
        System.out.println(triangle1.getInfo());

    }
}
