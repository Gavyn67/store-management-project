public class Device {
	private String brand;   // Brand of the device
	private String model;   // Model name or number
	private String color;   // Color of the device
	private int memory;     // RAM in GB
	private int storage;    // Storage in GB
	private double price;   // Price in USD

  //Default constructor
  public Device() {
    brand = "Brand";
    model = "Model";
    color = "Color";
    memory = 0;
    storage = 0;
    price = 0;
  }

  //Parameterized constructor
  public Device(String brand, String model, String color, int memory, int storage, double price) {
    this.brand = brand;
    this.model = model;
    this.color = color;
    this.memory = memory;
    this.storage = storage;
    this.price = price;
  }

  	// Returns the brand of the device
	public String getBrand() {
		return brand;
	}

	// Returns the model of the device
	public String getModel() {
		return model;
	}

	// Returns the color of the device
	public String getColor() {
		return color;
	}

	// Returns the memory (RAM) of the device
	public int getMemory() {
		return memory;
	}

	// Returns the storage of the device
	public int getStorage() {
		return storage;
	}

	// Returns the price of the device
	public double getPrice() {
		return price;
	}

	// Sets a new price for the device
	public void setPrice(double price) {
		this.price = price;
	}

	// Sets a new color for the device
	public void setColor(String color) {
		this.color = color;
	}
}