package web.model;

public class Car {
    private String carModel;

    private String brand;

    private int price;

    public Car() {
    }

    public Car(String carModel, String brand, int price) {
        this.carModel = carModel;
        this.brand = brand;
        this.price = price;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
