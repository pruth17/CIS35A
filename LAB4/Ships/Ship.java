package Ships;
/*
 * Pruthvirajsinh Punwar
 * CIS 35A Online Section
 * LAB 4 PART 2
 * 2/27/2019
 * 2/27/2019
 */

public class Ship {
	// instance variables for the ship class

	private String name;
	private String owner;
	private String origin;
	private String departureDate;
	private String arrivaleDate;
	private String departingPort;
	private String arrivalPort;
	private int length;
	private int width;
	private int height;
	private int capacity;

	// Default Constructor
	public Ship() {
		super();
	}

	// Constructor with all fields for instance variables
	public Ship(String name, String owner, String origin, String departureDate, String arrivaleDate,
			String departingPort, String arrivalPort, int length, int width, int height, int capacity) {
		super();
		this.name = name;
		this.owner = owner;
		this.origin = origin;
		this.departureDate = departureDate;
		this.arrivaleDate = arrivaleDate;
		this.departingPort = departingPort;
		this.arrivalPort = arrivalPort;
		this.length = length;
		this.width = width;
		this.height = height;
		this.capacity = capacity;
	}

	// Returns ship name
	public String getName() {
		return name;
	}

	// Sets ship name
	public void setName(String name) {
		this.name = name;
	}

	// Returns ship owner name
	public String getOwner() {
		return owner;
	}

	// Sets ship owner name
	public void setOwner(String owner) {
		this.owner = owner;
	}

	// Return ship origin
	public String getOrigin() {
		return origin;
	}

	// Set sips origin
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	// Return ships leave date
	public String getDepartureDate() {
		return departureDate;
	}

	// Set ships leave date
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	// Return Ships arrival date
	public String getArrivaleDate() {
		return arrivaleDate;
	}

	// Set ships arrival date
	public void setArrivaleDate(String arrivaleDate) {
		this.arrivaleDate = arrivaleDate;
	}

	// Return ships leave port
	public String getDepartingPort() {
		return departingPort;
	}

	// Set departure port for ship
	public void setDepartingPort(String departingPort) {
		this.departingPort = departingPort;
	}

	// Return arrival port for ship
	public String getArrivalPort() {
		return arrivalPort;
	}

	// set arrival date for ship
	public void setArrivalPort(String arrivalPort) {
		this.arrivalPort = arrivalPort;
	}

	// Returns ship length
	public int getLength() {
		return length;
	}

	// Sets ship Length
	public void setLength(int length) {
		this.length = length;
	}

	// Returns ship width
	public int getWidth() {
		return width;
	}

	// Sets ship width
	public void setWidth(int width) {
		this.width = width;
	}

	// Return ship height
	public int getHeight() {
		return height;
	}

	// Set shp height
	public void setHeight(int height) {
		this.height = height;
	}

	// Returns ship capacity
	public int getCapacity() {
		return capacity;
	}

	// Sets ship capacity
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String toString() {
		return "Name          = " + name + "\nOwner         = " + owner + "\nOrigin        = " + origin
				+ "\nDeparture Date = " + departureDate + "\nArrivale Date  = " + arrivaleDate + "\nDeparting Port = "
				+ departingPort + "\nArrival Port   = " + arrivalPort + "\nLength        = " + length
				+ "\nWidth         = " + width + "\nHeight        = " + height + "\nCapacity      = " + capacity + "\n";
	}

	// Compiles all ship data into a string and returns it

}
