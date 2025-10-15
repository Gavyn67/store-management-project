/* The Phone class represents a specific type of device, and
it inherits from the Device superclass and adds attributes specific
to the phone.
 */
public class Phone extends Device {
  	private String phoneProcessor; // The processor model of the phone
  	private int refreshRate;       // Screen refresh rate in Hz

    //Default constructor
    public Phone() {
      phoneProcessor = "Processor";
      refreshRate = 60;
    }

    //Parameterized constructor
    public Phone(String brand, String model, String color, int memory, int storage, double price, 
                 String phoneProcessor, int refreshRate) {
      super(brand, model, color, memory, storage, price);
      this.phoneProcessor = phoneProcessor;
      this.refreshRate = refreshRate;
    }
  
	// Returns the phone processor
	public String getPhoneProcessor() {
		return phoneProcessor;
	}

	// Returns the screen refresh rate
	public int getRefreshRate() {
		return refreshRate;
	}

	// Sets a new refresh rate for the phone
	public void setRefreshRate(int refreshRate) {
		this.refreshRate = refreshRate;
	}


  // Returns readable information about the Phone
  public String toString() {
    return "Brand: " + getBrand() + "\n" +
          "Model: " + getModel() + "\n" +
          "Color: " + getColor() + "\n" +
          "Memory: " + getMemory() + "GB\n" +
          "Storage: " + getStorage() + "GB\n" +
          "Price: $" + getPrice() + "\n" +
          "Phone Processor: " + getPhoneProcessor() + "\n" +
          "Refresh Rate: " + getRefreshRate() + "Hz\n";
    }
}
