public class Main
{
    public static void main(String[] args)
    {
        double costSummer = 160.71;
        double costSpring = 257.95;
        double costFall = 200.0;
        double costWinter = 350.95;
        double totalCost = costFall + costSpring + costSummer + costWinter;

        System.out.println("Your Maintenance cost for summer is " + costSummer);
        System.out.println("Your Maintenance cost for summer is " + costSpring);
        System.out.println("Your Maintenance cost for summer is " + costFall);
        System.out.println("Your Maintenance cost for summer is " + costWinter);
        System.out.println("Your Total Maintenance cost for the year is " + totalCost);

    }
}