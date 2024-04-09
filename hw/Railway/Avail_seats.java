package Railway;

import java.io.*;
import java.util.*;

public class Avail_seats{	
    public static void availablity() throws IOException {
		int first_class_seats=0,second_class_seats=0;
		String line = null;
		File seat = new File("seats.txt");
		Scanner reader = new Scanner(seat);
		while (reader.hasNextLine()) {
			line = reader.nextLine();
		}
		if (line != null) {
		  String[] parts = line.split(",");
		  first_class_seats = Integer.parseInt(parts[0]);
		  second_class_seats = Integer.parseInt(parts[1]);
		}	
		System.out.println("The number of seats in First class: "+first_class_seats+"\nThe number of seats in Second class: "+ second_class_seats);
		return;
	}
}
