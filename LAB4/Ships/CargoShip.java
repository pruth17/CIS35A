package Ships;
/*
 * Pruthvirajsinh Punwar
 * CIS 35A Online Section
 * LAB 4 PART 2
 * 2/27/2019
 * 2/27/2019
 */

public class CargoShip extends Ship {
	
	
    // this class is child class of ship class
	// Cargo Ship data instance variables
	private String cargoType;
	private String loadingMethod;
	private int numberOfCranes;
	private int contraband;
	private int cargoValue;

	// Default Constructor
	public CargoShip() {
		super();
	}

	// Constructor with fields satisfying this class data only
	public CargoShip(String cargoType, String loadingMethod, int numberOfCranes, int contraband, int cargoValue) {
		super();
		this.cargoType = cargoType;
		this.loadingMethod = loadingMethod;
		this.numberOfCranes = numberOfCranes;
		this.contraband = contraband;
		this.cargoValue = cargoValue;
	}

	// Constructor with fields satisfying this class and parent class data
	public CargoShip(String name, String owner, String origin, String departureDate, String arrivaleDate,
			String departingPort, String arrivalPort, int length, int width, int height, int capacity, String cargoType,
			String loadingMethod, int numberOfCranes, int contraband, int cargoValue) {
		super(name, owner, origin, departureDate, arrivaleDate, departingPort, arrivalPort, length, width, height,
				capacity);
		this.cargoType = cargoType;
		this.loadingMethod = loadingMethod;
		this.numberOfCranes = numberOfCranes;
		this.contraband = contraband;
		this.cargoValue = cargoValue;
	}

	// Return cargo type
	public String getCargoType() {
		return cargoType;
	}

	// Set cargo type
	public void setCargoType(String cargoType) {
		this.cargoType = cargoType;
	}

	// Return Loading Method
	public String getLoadingMethod() {
		return loadingMethod;
	}

	// Set loading method
	public void setLoadingMethod(String loadingMethod) {
		this.loadingMethod = loadingMethod;
	}

	// Return number of cranes
	public int getNumberOfCranes() {
		return numberOfCranes;
	}

	// Set number of cranes
	public void setNumberOfCranes(int numberOfCranes) {
		this.numberOfCranes = numberOfCranes;
	}

	// Return contraband
	public int getContraband() {
		return contraband;
	}

	// Set contraband
	public void setContraband(int contraband) {
		this.contraband = contraband;
	}

	// Return Cargo Value
	public int getCargoValue() {
		return cargoValue;
	}

	// Set cargo Value
	public void setCargoValue(int cargoValue) {
		this.cargoValue = cargoValue;
	}

	// Compiles the data from this class and the parent class into
	// a String and returns it
	public String toString() {
		return super.toString() + "\n Cargo Capacity = " + cargoType + "\nLoading Method  = " + loadingMethod
				+ "\n   # of Cranes  = " + numberOfCranes + "\n    Contraband  = " + contraband + "\n   Cargo Value  = "
				+ cargoValue + "\n";
	}
}
