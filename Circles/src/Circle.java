/**
 * ------------------------------------------------------------
 * File Name : Circle.java
 * Project Name : Lab 3
 * ------------------------------------------------------------
 * Author's Name and  email : Bryson Brandon, brandonbc@etsu.edu
 * Course Section : 900
 * Creation Date : 3/6/21
 * Last Modified : (Bryson Brandon, 3/7/21, brandonbc@etsu.edu)
 * -------------------------------------------------------------
 */

/**
 * Class Name : Circle
 * Class Purpose : Circle Methods
 *
 * Date Created : 3/6/21
 * Last Modified : (Bryson Brandon, 3/7/21, brandonbc@etsu.edu)
 * @author Author's name here : Bryson Brandon
 */

public class Circle
{
    //creates the private double radius
    private double radius;
    private String name;

    /**
     * Method Name : Circle
     * Method Purpose : This Creates the default constructor for circles.
     *
     * Date created : Mar 6, 2021
     * Date Last Modified : Mar 7, 2021
     *
     * Notes on specifications, special algorithms,
     * and assumptions: N/A
     */
    //creates the default constructor
    public Circle(double cir1Radius)
    {
    }//ends Circle method

    /**
     * Method Name : setRadius
     * Method Purpose : This creates the method to set the radius
     *
     * Date created : Mar 6, 2021
     * Date Last Modified : Mar 7, 2021
     *
     * Notes on specifications, special algorithms,
     * and assumptions: N/A
     *
     */
//creates the method to set the radius
    public void setRadius(double rad)
    {
     radius = rad;
    }//ends setRadius method

    /**
     * Method Name : getRadius
     * Method Purpose : This creates the method to set the radius
     *
     * Date created : Mar 6, 2021
     * Date Last Modified : Mar 7, 2021
     *
     * Notes on specifications, special algorithms,
     * and assumptions: N/A
     */
    //creates the method to get the radius
    public double getRadius()
    {
        return radius;
    }//ends getRadius method


    /**
     * Method Name : getDiameter
     * Method Purpose : This creates the method to get the diameter.
     *
     * Date created : Mar 6, 2021
     * Date Last Modified : Mar 7, 2021
     *
     * Notes on specifications, special algorithms,
     * and assumptions: N/A
     */
//creates the method to get the diameter
public double getDiameter()
        {
            double diameter = (radius * 2);
            return diameter;
        }//ends getDiameter method


    /**
     * Method Name : getArea
     * Method Purpose : This creates the method to get the Area of a circle
     *
     * Date created : Mar 6, 2021
     * Date Last Modified : Mar 7, 2021
     *
     * Notes on specifications, special algorithms,
     * and assumptions: N/A
     */
        //creates the method to get the area of a circle
public double getArea()
{
    double pi = 3.14159;
    double area = (pi * radius * radius);
    return area;
}//ends getArea method

    /**
     * Method Name : Circle
     * Method Purpose : This creates the constructor
     * for the required radius value and name.
     *
     * Date created : Mar 6, 2021
     * Date Last Modified : Mar 7, 2021
     *
     * Notes on specifications, special algorithms,
     * and assumptions: N/A
     */
    //constructor for the required radius value and name.
    public Circle(double rad, String circleName)
        {
            setRadius(rad);
            setName(circleName);
        }//ends circle method


    /**
     * Method Name : getInfo
     * Method Purpose : This creates the method to display the circles information.
     *
     * Date created : Mar 6, 2021
     * Date Last Modified : Mar 7, 2021
     *
     * Notes on specifications, special algorithms,
     * and assumptions: N/A
     */
                //method to display the circles info.
                public String getInfo()
                    {
                    System.out.println(getName());
                    System.lineSeparator();

                    System.out.println("Radius: " + getRadius());
                    System.lineSeparator();

                    System.out.println("Diameter: " + getDiameter());
                    System.lineSeparator();

                    System.out.println("Area: " + getArea());
                    System.lineSeparator();

                        return name;
                    }//end getInfo method



    /**
     * Method Name : setName
     * Method Purpose : This is the method to set a circles name.
     *
     * Date created : Mar 6, 2021
     * Date Last Modified : Mar 7, 2021
     *
     * Notes on specifications, special algorithms,
     * and assumptions: N/A
     */
    //method to set the name of a circle
        public void setName(String thename)
        {
            this.name = thename;
        }//end setName method


    /**
     * Method Name : getName
     * Method Purpose : This is the method to get a circles name.
     *
     * Date created : Mar 6, 2021
     * Date Last Modified : Mar 7, 2021
     *
     * Notes on specifications, special algorithms,
     * and assumptions: N/A
     */
            //method to call the name of a circle.
            public String getName()
            {
                return name;
            }//end getName method
        }//ends class Circle