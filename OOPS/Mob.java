package OOPS;

 class Mobile {

    String brand;
    String model;
    private String imeiNumber;
    double price;

    public void setImeiNumber(String imeiNumber) {
        this.imeiNumber = imeiNumber;
    }

    public String getImeiNumber() {
        return imeiNumber;
    }

}


public class Mob {

    public static void main(String[] args) {

        Mobile mobile = new Mobile();

        mobile.brand = "Samsung";
        mobile.model = "Galaxy S24";
        mobile.price = 79999;

        mobile.setImeiNumber("356789123456789");

        System.out.println("Brand: " + mobile.brand);
        System.out.println("Model: " + mobile.model);
        System.out.println("IMEI Number: " + mobile.getImeiNumber());
        System.out.println("Price: " + mobile.price);

    }

}