package Ch36;

public class Car {
	private String carNumber;
	private String model;
	private Engine engine;
	private Radio radio;
	

	public Car(String carNumber, String model) {
		super();
		this.carNumber = carNumber;
		this.model = model;
		this.engine = new Engine();
		this.radio = new Radio();
	}

	
	public void move()
	{
		System.out.println("자동차가 움직입니다");
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Radio getRadio() {
		return radio;
	}

	public void setRadio(Radio radio) {
		this.radio = radio;
	}
}
