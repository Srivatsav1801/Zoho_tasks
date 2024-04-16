class Customer {
    int id;
    String pickupPoint;
    String dropPoint;
    int pickupTime;

    public Customer(int id, String pickupPoint, String dropPoint, int pickupTime) {
        this.id = id;
        this.pickupPoint = pickupPoint;
        this.dropPoint = dropPoint;
        this.pickupTime = pickupTime;
    }
}

class Taxi {
    int id;
    String location;
    double earnings;
	List<Booking> bookings;

    public Taxi(int id, String location) {
        this.id = id;
        this.location = location;
        this.earnings = 0;
		this.bookings = new ArrayList<>();
    }
}

class BookingSystem {
    List<Taxi> taxis;

    public BookingSystem(List<Taxi> taxis) {
        this.taxis = taxis;
    }

    public String bookTaxi(Customer customer) {
        List<Taxi> availableTaxis = new ArrayList<>();
        for (Taxi taxi : taxis) {
            if (taxi.location.equals(customer.pickupPoint)) {
                availableTaxis.add(taxi);
            }
        }

        if (availableTaxis.isEmpty()) {
			
        }
		
        if (availableTaxis.isEmpty()) {
            return "Booking rejected";
        }

        Taxi chosenTaxi = Collections.min(availableTaxis, Comparator.comparing(t -> t.earnings));

        double distance = calculateDistance(customer.pickupPoint, customer.dropPoint);
        double fare = calculateFare(distance);

        chosenTaxi.location = customer.dropPoint;
        chosenTaxi.earnings += fare;

        return "Taxi " + chosenTaxi.id + " is booked. The fare is Rs." + fare;
    }

    public double calculateDistance(String pickupPoint, String dropPoint) {
		
        return 0;
    }

    public double calculateFare(double distance) {
        
        return 0;
    }
}
