import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Driver
{
    private String ID;
    private String lastName;
    private String firstName;
    private int carYear;
    private String carMake;
    private String carModel;
    private int CURRENT_YEAR = 2021;

    public String getID()
    {
        return ID;
    }

    public void setID(String ID)
    {
        this.ID = ID;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public int getCarYear()
    {
        return carYear;
    }

    public void setCarYear(int carYear)
    {
        this.carYear = carYear;
    }

    public String getCarMake()
    {
        return carMake;
    }

    public void setCarMake(String carMake)
    {
        this.carMake = carMake;
    }

    public String getCarModel()
    {
        return carModel;
    }

    public void setCarModel(String carModel)
    {
        this.carModel = carModel;
    }

    public int getCurrentValue()
    {

        int vehicleYear = carYear;
        if(CURRENT_YEAR - vehicleYear > 19) return 1000;
        return 20000 - ((CURRENT_YEAR - vehicleYear) * 1000);
    }
}
