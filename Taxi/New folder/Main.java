import java.util.*;

class Taxi {
    private String taxiNo;
    private int totalEarnings;
    private String currentPoint;
    private int currentID;

    public Taxi(String taxiNo) {
        this.taxiNo = taxiNo;
        this.totalEarnings = 0;
        this.currentPoint = "A";
        this.currentID = 1;
    }

    public String getTaxiNo() {
        return taxiNo;
    }

    public int getTotalEarnings() {
        return totalEarnings;
    }

    public String getCurrentPoint() {
        return currentPoint;
    }

    public void assign_Taxi(int bookingID, String dropPoint, int amount) {
        this.currentID = bookingID;
        this.currentPoint = dropPoint;
        this.totalEarnings += amount;
        System.out.println("Taxi " + getTaxiNo() + " is allotted for Booking ID " + bookingID);
        System.out.println("Total Earnings for Taxi " + getTaxiNo() + ": Rs. " + totalEarnings);
    }
	
}

class Booking {
    private int bookingIDCounter = 1;
    private int bookingID;
    private int customerID;
    private String pickupPoint;
    private String dropPoint;
    private int pickupTime;
    private int dropTime;
    private int amount;

    public Booking(int customerID, String pickupPoint, String dropPoint, int pickupTime) {
        this.bookingID = bookingIDCounter++;
        this.customerID = customerID;
        this.pickupPoint = pickupPoint;
        this.dropPoint = dropPoint;
        this.pickupTime = pickupTime;
		this.dropTime = dropTime;
    }
	
	public void setDropTime(int dropTime){
		this.dropTime = dropTime;
	}
	
	public void setAmount(int amount){
		this.amount = amount;
	}
	
    public int getBookingID() {
        return bookingID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getPickupPoint() {
        return pickupPoint;
    }

    public String getDropPoint() {
        return dropPoint;
    }

    public int getPickupTime() {
        return pickupTime;
    }

    public int getDropTime() {
        return dropTime;
    }

    public int getAmount() {
        return amount;
    }
}
class TaxiService {
    private List<Taxi> taxis;
    private Map<String, List<Booking>> bookings;
    public TaxiService(int numOfTaxis) {
        taxis = new ArrayList<>();
        for (int i = 1; i <= numOfTaxis; i++) {
            taxis.add(new Taxi("Taxi-" + i));
        }
        bookings = new HashMap<>();
		for (char point = 'A'; point <= 'F'; point++) {
            bookings.put(String.valueOf(point), new ArrayList<>());
        }  
    }

    public String bookTaxi(int customerID, String pickupPoint, String dropPoint, int pickupTime) {
        if (!bookings.containsKey(pickupPoint)) {
            return "Invalid pickup point";
        }
        Booking newBooking = new Booking(customerID, pickupPoint, dropPoint, pickupTime);
        List<Taxi> availableTaxis = findAvailableTaxis(pickupPoint, pickupTime);
        if (availableTaxis.isEmpty()) {
            return "No available taxi at the moment";
        }
		Taxi chosenTaxi = availableTaxis.get(0);
        int amount = calculateAmount(pickupPoint, dropPoint);
        chosenTaxi.assign_Taxi(newBooking.getBookingID(), pickupPoint, dropPoint, newBooking.getDropTime(), amount);
        newBooking.setDropTime(newBooking.getPickupTime() + 1);
        newBooking.setAmount(amount);
        return "Taxi can be allotted. " + chosenTaxi.getTaxiNo() + " is allotted";
    }
    public List<Taxi> findAvailableTaxis(String pickupPoint, int pickupTime) {
        List<Taxi> availableTaxis = new ArrayList<>();
		for(){}
		
        return availableTaxis;
    }
    public int calculateAmount(String pickupPoint, String dropPoint) {
		int pt = -1; 
		int dp = -1;
		String[] points = {"A","B","C","D","E","F"};
		int[] distances = {0,15,30,45,60,75};
		for(int i = 0;i<6;i++){
			if(points[i].equals(pickupPoint)){
				pt = distances[i];
			}
			if(points[i].equals(dropPoint)){
				dp = distances[i];
			}
		}
        int distance = Math.abs(dp-pt);
        int amount = 100; 
        distance -= 5; 
        if (distance > 0) {
            amount += distance * 10; 
        }
        return amount;
    }
    public void display_Taxi_Details() {
    }
}

public class Main {
    public static void main(String[] args) {
		System.out.println("Enter the no of taxi available: ");
		Scanner sc = new Scanner(System.in);
		TaxiService taxi_Service = new TaxiService(sc.nextInt());
		System.out.println("Welcome to taxi booking system");
		int id = 1;
		boolean flag = true;
		while(flag){
			System.out.println("A-->B-->C-->D-->E-->F\nEach Station is 15km apart:");
			System.out.println("Enter the Pickup Point: ");
			String pickupPoint = sc.next();
			System.out.println("Enter the Drop Point: ");
			String dropPoint = sc.next();
			System.out.println("Enter the Pickup Time:");
			int pickupTime = sc.nextInt();
			System.out.println(taxi_Service.bookTaxi(id,pickupPoint,dropPoint,pickupTime));
			
		}
        taxi_Service.display_Taxi_Details();
    }
}
