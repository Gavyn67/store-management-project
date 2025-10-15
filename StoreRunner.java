import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    /* Computer(brand, model, color, memory, storage, price, 
       cpu, gpu, formFactor, isLiquidCooled) */
    Computer myComputer1 = new Computer("Dell", "HP 64", "Black", 32, 256, 999.99,
                                        "Intel i7-10700F", "GTX 1080", "EATX", true);
    /*Phone(String brand, String model, String color, int memory, int storage, double price, 
      String phoneProcessor, int refreshRate */
    Phone myPhone1 = new Phone("Apple", "iPhone 15 Pro", "Blue", 8, 256, 1199.99, 
                               "A17 Bionic", 120);

    //Prints myComputer1's details
    System.out.println("myComputer1 details:");
    System.out.println(myComputer1.toString());

    System.out.println();

    //Prints myPhone1's details
    System.out.println("myPhone1 details:");
    System.out.println(myPhone1.toString());

    System.out.println();

    //Sets new attributes
    myComputer1.setPrice(1235.12);
    myComputer1.setIsLiquidCooled(false);
    myPhone1.setColor("Yellow");
    myPhone1.setRefreshRate(240);

    //Prints myComputer1's updated details
    System.out.println("myComputer1 updated details:");
    System.out.println(myComputer1.toString());

    System.out.println();

    //Prints myPhone1's updated details
    System.out.println("myPhone1 updated details:");
    System.out.println(myPhone1.toString());
  }
}