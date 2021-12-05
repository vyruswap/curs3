package curs3;

public class TestCar {

	public static void main(String[] args) {
		Car obiect = new Car("brand", "engine");
		obiect.setType("Suv");
		System.out.println(obiect.carDetails());
		
		Car obiect2 = new Car("brand", "engine");
		obiect2.setType("Sedan");
		System.out.println(obiect2.carDetails());
		System.out.println(obiect.carDetails());
	}

}
