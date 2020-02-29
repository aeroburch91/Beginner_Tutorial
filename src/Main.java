public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        Flight lax1 = new Flight();
        Flight lax2 = new Flight();

        // add passengers
        lax1.add1Passenger();
        lax2.add1Passenger();

        Flight lax3 = null;
        if(lax1.hasRoom(lax2))
        {
            lax3 = lax1.createNewWithBoth(lax2);
        }

        if (lax3 != null)
            System.out.println("Flights Combined");

        System.out.println("lax1 = " + lax1);
        System.out.println("lax2 = " + lax2);
        System.out.println("lax3 = " + lax3);
    }
}
