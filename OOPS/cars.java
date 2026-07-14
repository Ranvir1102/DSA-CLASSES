package OOPS;

 class Car {

    String brand;
    String model;
    private String engineNumber;
    double price;

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Engine Number: " + engineNumber);
        System.out.println("Price: " + price);
    }

}



public class cars {

    public static void main(String[] args) {

        Car car = new Car();

        car.brand = "Toyota";
        car.model = "Fortuner";
        car.price = 4500000;

        car.setEngineNumber("ENG123456789");

        car.displayDetails();

    }

}