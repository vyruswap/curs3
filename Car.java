package curs3;

public class Car {

	public static String brand;
	public static String type;
	public static String engine;

	public Car(String brand, String engine) {
		setBrand(brand);
		setEngine(engine);
	}

	public static String getBrand() {
		return brand;
	}

	public static void setBrand(String brand) {
		Car.brand = brand;
	}

	public static String getEngine() {
		return engine;
	}

	public static void setEngine(String engine) {
		Car.engine = engine;
	}

	public static String getType() {
		return type;
	}

	public static void setType(String type) {
		Car.type = type;
	}


public static String carDetails() {
	return "All " + brand + " cars are " + engine + " and are of type " + type;
}

}
