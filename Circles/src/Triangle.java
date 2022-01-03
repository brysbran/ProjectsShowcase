/**
 * ------------------------------------------------------------
 * File Name : Triangle.java
 * Project Name : Lab 3
 * ------------------------------------------------------------
 * Author's Name and  email : Bryson Brandon, brandonbc@etsu.edu
 * Course Section : 900
 * Creation Date : 3/6/21
 * Last Modified : (Bryson Brandon, 3/7/21, brandonbc@etsu.edu)
 * -------------------------------------------------------------
 */
/**
 * Class Name : Triangle
 * Class Purpose : Triangle Constructor
 *
 * Date Created : 3/7/21
 * Last Modified : (Bryson Brandon, 3/7/21, brandonbc@etsu.edu)
 * @author Author's name here : Bryson Brandon
 */
public class Triangle
{

            //creates the private doubles for side A and B, and the string for the name.
             private double sideA;
            private double sideB;
            private String name;


/**
 * Method Name : Triangle
 * Method Purpose : The default constructor for the triangle object.
 *
 * Date created : Mar 7, 2021
 * Date Last Modified : Mar 7, 2021
 *
 * Notes on specifications, special algorithms,
 * and assumptions: N/A
 * */
            public Triangle(double a, double b)
            {
            }//end method Triangle

    /**
     * Method Name : setSideA
     * Method Purpose : Creates the method to set the side A.
     *
     * Date created : Mar 7, 2021
     * Date Last Modified : Mar 7, 2021
     *
     * Notes on specifications, special algorithms,
     * and assumptions: N/A
     * */
            public void setSideA(double Aaa)
            {
                sideA = Aaa;
            }//end method setSideA


    /**
     * Method Name : getSideA
     * Method Purpose : Creates the method to call the value for sideA
     *
     * Date created : Mar 7, 2021
     * Date Last Modified : Mar 7, 2021
     *
     * Notes on specifications, special algorithms,
     * and assumptions: N/A
     * */
            public double getSideA()
            {
                return sideA;
            }//end method getSideA


    /**
     * Method Name : setName
     * Method Purpose : Creates the method to set the triangle's name.
     *
     * Date created : Mar 7, 2021
     * Date Last Modified : Mar 7, 2021
     *
     * Notes on specifications, special algorithms,
     * and assumptions: N/A
     * */
            public void setName(String triangleName)
            {
                name = triangleName;
            }//end method setName


    /**
     * Method Name : getName
     * Method Purpose : Creates the method to call the name of the triangle.
     *
     * Date created : Mar 7, 2021
     * Date Last Modified : Mar 7, 2021
     *
     * Notes on specifications, special algorithms,
     * and assumptions: N/A
     * */
    public String getName()
    {
        return name;
    }//end method getName


    /**
     * Method Name : setsideB
     * Method Purpose : Creates the method to set the value of side B.
     *
     * Date created : Mar 7, 2021
     * Date Last Modified : Mar 7, 2021
     *
     * Notes on specifications, special algorithms,
     * and assumptions: N/A
     * */
    public void setSideB(double Bbb)
    {
        sideB = Bbb;
    }//end method setSideB


    /**
     * Method Name : getSideB
     * Method Purpose : Creates the method to call the value for side B.
     *
     * Date created : Mar 7, 2021
     * Date Last Modified : Mar 7, 2021
     *
     * Notes on specifications, special algorithms,
     * and assumptions: N/A
     * */
    public double getSideB()
    {
        return sideB;

    }//end method getSideB

    /**
     * Method Name : getHypotenuse
     * Method Purpose : Creates the method to call the value for the hypotenuse of the
     * triangle by adding sideA and sideB.
     *
     * Date created : Mar 7, 2021
     * Date Last Modified : Mar 7, 2021
     *
     * Notes on specifications, special algorithms,
     * and assumptions: N/A
     * */
    public double getHypotenuse()
    {
        double hypotenuse = sideA + sideB;
        return hypotenuse;
    }//end method getHypotenuse


    /**
     * Method Name : Triangle(double Aaa, double Bbb, String triangularName)
     * Method Purpose : Creates the triangle method with the required values for
     * programmer input.
     *
     * Date created : Mar 7, 2021
     * Date Last Modified : Mar 7, 2021
     *
     * Notes on specifications, special algorithms,
     * and assumptions: N/A
     * */
    public Triangle(double Aaa, double Bbb, String triangularName)
    {
        setSideA(Aaa);
        setSideB(Bbb);
        setName(triangularName);

    }//end method Triangle(double Aaa, double Bbb, String triangularName)

    /**
     * Method Name : getArea
     * Method Purpose : Creates the method to find the area of a triangle.
     *
     * Date created : Mar 7, 2021
     * Date Last Modified : Mar 7, 2021
     *
     * Notes on specifications, special algorithms,
     * and assumptions: N/A
     * */
    public double getArea()
    {
      double area = ((sideA * sideB) / 2)  ;
      return area;
    }//end method getArea

    /**
     * Method Name : getInfo
     * Method Purpose : Creates the method to retrieve the name of the triangle, the length
     * of side A, the length of side B, the length of the hypotenuse, and the area.
     *
     * Date created : Mar 7, 2021
     * Date Last Modified : Mar 7, 2021
     *
     * Notes on specifications, special algorithms,
     * and assumptions: N/A
     * */
    public String getInfo()
    {
        System.out.println("Triangle: ");
        System.out.println("A: " + getSideA());
        System.out.println("B: " + getSideB());
        System.out.println("H: " + getHypotenuse());
        System.out.println("Area: " + getArea());
        return name;
    }//end method getInfo
}//end class Triangle
