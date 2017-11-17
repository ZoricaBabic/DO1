package adapter;

public class TestAdapter {

	public static void main(String[] args) {
		Vehicle car = new Car();
		Vehicle plane = new Plane();
		Vehicle ship = new Ship();
		Vehicle boat = new BoatAdapter(new Boat());
		
		car.accelerate();
		plane.accelerate();
		ship.accelerate();
		boat.accelerate();
	}

}
