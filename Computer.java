/* The Computer class represents a specific type of device, and
it inherits from the Device superclass and adds attributes specific
to the computer.
 */
public class Computer extends Device {
	private String cpu;            // The CPU model of the computer
	private String gpu;            // The GPU model of the computer
	private String formFactor;     // Form factor of the computer case
	private boolean isLiquidCooled; // Whether the computer has liquid cooling

	/**

  //Default constructor
  public Computer() {
    cpu = "CPU";
    gpu = "GPU";
    formFactor = "ATX";
    isLiquidCooled = false;
  }

  //Parameterized constructor
  public Computer(String brand, String model, String color, int memory, int storage, double price, 
                  String cpu, String gpu, String formFactor, boolean isLiquidCooled) {
    super(brand, model, color, memory, storage, price);
    this.cpu = cpu;
    this.gpu = gpu;
    this.formFactor = formFactor;
    this.isLiquidCooled = isLiquidCooled;
  }

 
	// Returns the CPU of the computer
	public String getCpu() {
		return cpu;
	}
  
	// Returns the GPU of the computer
	public String getGpu() {
		return gpu;
	}
  
	// Returns the form factor of the computer case
	public String getFormFactor() {
		return formFactor;
	}
  
	// Returns whether the computer is liquid cooled
	public boolean getIsLiquidCooled() {
		return isLiquidCooled;
	}
  
	// Sets whether the computer is liquid cooled
	public void setIsLiquidCooled(boolean isLiquidCooled) {
		this.isLiquidCooled = isLiquidCooled;
	}

  // Returns readable information about the Computer
  public String toString() {
      return "CPU: " + getCpu() + "\n" +
             "GPU: " + getGpu() + "\n" +
             "Form Factor: " + getFormFactor() + "\n" +
             "Liquid cooled: " + getIsLiquidCooled() + "\n" +
             "Brand: " + getBrand() + "\n" +
             "Model: " + getModel() + "\n" +
             "Color: " + getColor() + "\n" +
             "Memory: " + getMemory() + "GB\n" +
             "Storage: " + getStorage() + "GB\n" +
             "Price: $" + getPrice();
  }
}