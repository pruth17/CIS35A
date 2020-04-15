crpackage Ships;
/*
 * Pruthvirajsinh Punwar
 * CIS 35A Online Section
 * LAB 4 PART 2
 * 2/27/2019
 * 2/27/2019
 */

public class CruiseShip extends Ship{
	// this class is child of ship class
	// Cruise Ship Data instance variables
	private float ticketPrice;
	private int numberofRooms;
	private String buffetmenu;
	private String services[];
	private String cruiseType;

	// Default Constructor
	public CruiseShip() {
		super();
	}

	// Constructor for data only in this class
	public CruiseShip(float ticketPrice, int numberofRooms, String buffetmenu, String[] services, String cruiseType) {
		super();
		this.ticketPrice = ticketPrice;
		this.numberofRooms = numberofRooms;
		this.buffetmenu = buffetmenu;
		this.services = services;
		this.cruiseType = cruiseType;
	}

	// Constructor for data in this class and parent class
	public CruiseShip(String name, String owner, String origin, String departureDate, String arrivaleDate,
			String departingPort, String arrivalPort, int length, int width, int height, int capacity,
			float ticketPrice, int numberofRooms, String buffetmenu, String[] services, String cruiseType) {
		super(name, owner, origin, departureDate, arrivaleDate, departingPort, arrivalPort, length, width, height,
				capacity);
		this.ticketPrice = ticketPrice;
		this.numberofRooms = numberofRooms;
		this.buffetmenu = buffetmenu;
		this.services = services;
		this.cruiseType = cruiseType;
	}

	// Return ticket price
	public float getTicketPrice() {
		return ticketPrice;
	}

	// Set ticket price
	public void setTicketPrice(float ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	// Return number of rooms
	public int getNumberofRooms() {
		return numberofRooms;
	}

	// Set number of rooms
	public void setNumberofRooms(int numberofRooms) {
		this.numberofRooms = numberofRooms;
	}

	// Return buffet menu
	public String getBuffetmenu() {
		return buffetmenu;
	}

	// Set buffet menu
	public void setBuffetmenu(String buffetmenu) {
		this.buffetmenu = buffetmenu;
	}

	// Return list of services
	public String[] getServices() {
		return services;
	}

	// Set list of services
	public void setServices(String[] services) {
		this.services = services;
	}

	// Return cruise type
	public String getCruiseType() {
		return cruiseType;
	}

	// Set cruise type
	public void setCruiseType(String cruiseType) {
		this.cruiseType = cruiseType;
	}

	// Returns string of data formatted for printing
	public String toString() {
		// build services into printable list
		String serv = "";
		for (String item : services)
			serv += "\n" + "\t    - " + item;

		// Return all data as string with parent class data
		return super.toString() + "\n  Ticket Price = " + ticketPrice + "\n    # Of Rooms = " + numberofRooms
				+ "\n   buffet menu = " + buffetmenu + "\n      services : " + serv + "\n   cruise type = " + cruiseType
				+ "\n";
	}
}
