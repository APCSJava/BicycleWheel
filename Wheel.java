
public class Wheel implements DataGenerator {
	
	double angularVelocity, wheelRadius, angle;
	
	public Wheel(double vel, double rad, double ang) {
		angularVelocity = vel;
		wheelRadius = rad;
		angle = ang;
	}

	@Override
	public void generateData(String outputFile, double time, double step) {
		double accumulated = 0.0;
		
		double x, y, vx, vy;
		while (accumulated <= time) {

			x = Math.cos(angle);
			y = Math.sin(angle);
			
			accumulated+=step;
		}
		
	}
	
	

}
