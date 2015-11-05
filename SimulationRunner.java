/**
 * Creates and runs simulations on classes that can be simulated
 * 
 * @author kentc14
 *
 */
public class SimulationRunner {

	public static void main(String[] args) {
		// modify the code below to call an appropriate constructor for your class
		DataGenerator wheel = new Wheel(0, 0, 0);
		
		// generate data for a specified time with constant delta-t
		wheel.generateData("wheel-data.csv", 2.0, 0.01);

	}

}
