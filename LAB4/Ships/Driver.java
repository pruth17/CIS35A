package Ships;

/*
 * Pruthvirajsinh Punwar
 * CIS 35A Online Section
 * LAB 4 PART 2
 * 2/27/2019
 * 2/27/2019
 */

public class Driver {

	public static void main(String[] args) {
		// declaring array of ships
		Ship ships[] = new Ship[9];

		// declaring Ships
		ships[0] = new Ship("Ship1", "Arjun", "India", "1/1/10", "1/12/10", "San Francisco", "Vancouver", 1000, 520,
				320, 620);
		ships[1] = new Ship("Ship2", "Priyanshi", "India", "2/2/19", "2/20/19", "Los Angeles", "San Francisco", 2200,
				1100, 600, 1220);
		ships[2] = new Ship("Ship3", "Pruthvi", "France", "3/3/10", "3/30/10", "London", "Oslo", 3020, 1250, 920, 1810);

		// declaring CargoShips
		ships[3] = new CargoShip("Destroyer", "Hotavya", "USA", "4/4/10", "4/10/10", "New York", "Hatford", 4030, 2020,
				1210, 2420, "wood", "load by car", 10, 11, 100);
		ships[4] = new CargoShip("Rogers", "John", "USA", "5/5/10", "5/20/10", "Miami", "New York", 5200, 2510, 1520,
				3020, "steel", "load by pick up", 20, 22, 200);
		ships[5] = new CargoShip("Valentina", "Sarthak", "Australia", "6/6/11", "6/30/11", "Mumbai", "Goa", 6020, 3000,
				1810, 3260, "coal", "load by man power", 30, 33, 300);

		// declaring services list
		String services1[] = { "Tofu", "Ramen", "Kimchi" };
		String services2[] = { "Panner Masala", "Biryani", "Raita", "Naan", "Sabji" };
		String services3[] = { "Burger", "Pizza", "Donuts", "French Fries", "HamBurger", "Bagel" };

		// declaring CruiseShips
		ships[6] = new CruiseShip("Titanic", "Dhruv", "New Zealand", "7/7/10", "7/10/10", "Auckland", "Melbourne", 700,
				70, 70, 60, 70f, 7, "Asian Food", services1, "booze cruise");
		ships[7] = new CruiseShip("Yacht", "Mike", "USA", "8/8/11", "8/20/12", "New York", "Los Angeles", 8200, 801,
				804, 602, 801f, 28, "Indian Theme", services2, "Party cruise");
		ships[8] = new CruiseShip("Desi", "Modi", "India", "9/9/10", "9/30/10", "Chennai", "Mumbai", 9020, 901, 902,
				603, 910f, 89, "American food", services3, "sightseeing cruise");

		// print all data with dynamic binding
		for (Ship ship : ships) {
			System.out.printf(ship.toString() + "\n");
		}
	}
}

/*
 * TEST RUN Name = Ship1 Owner = Arjun Origin = India Departure Date = 1/1/10
 * Arrivale Date = 1/12/10 Departing Port = San Francisco Arrival Port =
 * Vancouver Length = 1000 Width = 520 Height = 320 Capacity = 620
 * 
 * Name = Ship2 Owner = Priyanshi Origin = India Departure Date = 2/2/19
 * Arrivale Date = 2/20/19 Departing Port = Los Angeles Arrival Port = San
 * Francisco Length = 2200 Width = 1100 Height = 600 Capacity = 1220
 * 
 * Name = Ship3 Owner = Pruthvi Origin = France Departure Date = 3/3/10 Arrivale
 * Date = 3/30/10 Departing Port = London Arrival Port = Oslo Length = 3020
 * Width = 1250 Height = 920 Capacity = 1810
 * 
 * Name = Destroyer Owner = Hotavya Origin = USA Departure Date = 4/4/10
 * Arrivale Date = 4/10/10 Departing Port = New York Arrival Port = Hatford
 * Length = 4030 Width = 2020 Height = 1210 Capacity = 2420
 * 
 * Cargo Capacity = wood Loading Method = load by car # of Cranes = 10
 * Contraband = 11 Cargo Value = 100
 * 
 * Name = Rogers Owner = John Origin = USA Departure Date = 5/5/10 Arrivale Date
 * = 5/20/10 Departing Port = Miami Arrival Port = New York Length = 5200 Width
 * = 2510 Height = 1520 Capacity = 3020
 * 
 * Cargo Capacity = steel Loading Method = load by pick up # of Cranes = 20
 * Contraband = 22 Cargo Value = 200
 * 
 * Name = Valentina Owner = Sarthak Origin = Australia Departure Date = 6/6/11
 * Arrivale Date = 6/30/11 Departing Port = Mumbai Arrival Port = Goa Length =
 * 6020 Width = 3000 Height = 1810 Capacity = 3260
 * 
 * Cargo Capacity = coal Loading Method = load by man power # of Cranes = 30
 * Contraband = 33 Cargo Value = 300
 * 
 * Name = Titanic Owner = Dhruv Origin = New Zealand Departure Date = 7/7/10
 * Arrivale Date = 7/10/10 Departing Port = Auckland Arrival Port = Melbourne
 * Length = 700 Width = 70 Height = 70 Capacity = 60
 * 
 * Ticket Price = 70.0 # Of Rooms = 7 buffet menu = Asian Food services : - Tofu
 * - Ramen - Kimchi cruise type = booze cruise
 * 
 * Name = Yacht Owner = Mike Origin = USA Departure Date = 8/8/11 Arrivale Date
 * = 8/20/12 Departing Port = New York Arrival Port = Los Angeles Length = 8200
 * Width = 801 Height = 804 Capacity = 602
 * 
 * Ticket Price = 801.0 # Of Rooms = 28 buffet menu = Indian Themed services : -
 * Panner Masala - Biryani - Raita - Naan - Sabji cruise type = Party cruise
 * 
 * Name = Desi Owner = Modi Origin = India Departure Date = 9/9/10 Arrivale Date
 * = 9/30/10 Departing Port = Chennai Arrival Port = Mumbai Length = 9020 Width
 * = 901 Height = 902 Capacity = 603
 * 
 * Ticket Price = 910.0 # Of Rooms = 89 buffet menu = American food services : -
 * Burger - Pizza - Donuts - French Fries - HamBurger - Bagel cruise type =
 * sightseeing cruise
 * 
 */