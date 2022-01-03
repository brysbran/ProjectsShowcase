import java.util.ArrayList;

public class CarData
{
    public static void main(String[] args)
    {
        TextFileReader reader = new TextFileReader();
        ArrayList<Driver> driverList = reader.readFile("src/driverData.csv");

        //.stream() converts our ArrayList into a stream
        //.filter(item -> predicate) takes an input stream and creates a filtered output stream based on the predicate
        //.map(item -> itemToMapTo) maps an item of one type to an item of another type in a 1-1 ratio
        //.reduce(numberToStartTheAccumulator, (accumulator, placeholder) -> operation) reduces the incoming stream
        //  to a single value
        //.foreach(item -> operationToPerformOnEachItem) performs the specified operation on each item in the stream

        // Example: Get the value of all the Honda Civics in the stream and get a total
        int i = driverList.stream().filter(m -> m.getCarMake().equalsIgnoreCase("honda"))
                .filter(n -> n.getCarModel().equalsIgnoreCase("civic"))
                .map(o -> o.getCurrentValue())
                .reduce(0, (total, count) -> total + count);
        System.out.println("Total value: $" + i);
        System.out.println("----------------");


        // Solve each of the following problems using pipelines with lambdas as demonstrated above.
        // Problem 1: Print the first and last name of every driver that drives a Ford
        // Problem 2: Get and print the total value of the GMC Yukons in the list
        // Problem 3: Print the car make and model for any driver with the first name of Dollie
        // Problem 4: Print the last name of any driver whose car is worth more than $10,000
        // Problem 5: Print the first name and car model of any driver that owns a car made between
        //            2008 and 2014


        //filter is the prerequisites, map is what you are actually printing

        //1
        System.out.println("Names of Drivers of Fords: " );
        driverList.stream().filter(o -> o.getCarMake().equalsIgnoreCase("ford")).map(n -> n.getFirstName() + " " +  n.getLastName())
                .forEach(System.out::println);
        System.out.println("-------------------------");

        //2

        //0 in the reduce is the starting place, guarantees a returned int of at least 0
        System.out.println("Total Value of GMC Yukons:");
        int v  = driverList.stream().filter(n -> n.getCarMake().equalsIgnoreCase("gmc")).filter(m -> m.getCarModel().equalsIgnoreCase("yukon"))
                .map(o -> o.getCurrentValue()).reduce(0, (total, count) -> total + count);
        System.out.println(v);
        System.out.println("-------------------------");

        //3
        System.out.println("Cars with Drivers of first name Dollie:");
        driverList.stream().filter(n -> n.getFirstName().equalsIgnoreCase("dollie"))
                .map(o -> o.getCarMake() + " " +  o.getCarModel()).forEach(System.out::println);
        System.out.println("-------------------------");

        //4
        System.out.println("Drivers whose car is worth more than 10,000");
        driverList.stream().filter(n -> n.getCurrentValue() > 10000)
                .map(y -> y.getLastName()).forEach(System.out::println);
        System.out.println("--------------------------");

        //5
        System.out.println("First name and car model of any driver that owns a car made between 2008 and 2014");
        driverList.stream().filter(x -> x.getCarYear() > 2008).filter( x -> x.getCarYear() < 2014)
                .map(y -> y.getFirstName() + " - " + y.getCarModel()).forEach(System.out::println);
        System.out.println("---------------------------");

        //practice
        System.out.println("Car owners with a car valued below 10,000");
        driverList.stream().filter(x -> x.getCurrentValue() < 10000).map(y -> y.getFirstName() + " " + y.getLastName() + " - $" + y.getCurrentValue()).forEach(System.out::println);
        System.out.println("---------------------------");

    }
     



}
