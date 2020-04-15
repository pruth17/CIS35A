/*
 * Pruthvirajsinh Punwar
 * CIS 35A Online Section
 * LAB 3
 * 2/15/2019
 * 2/15/2019
 */
public class Franchise {
	// instance variables
	private Store stores[];

	public Franchise(int num) { // constructor
		stores = new Store[num];
	}

	public Store getStores(int i) {
		return stores[i];
	}

	public void setStores(Store stores, int i) {
		this.stores[i] = stores;
	}

	public int numberofstores() {
		return stores.length;
	}

}
