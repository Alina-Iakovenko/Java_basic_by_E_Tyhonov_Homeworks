package additionalTask;

public enum Vehicle {
    car1(10, "black"), car2(20,"white"), car3(30, "red");
    private int price;
    private String color;
    Vehicle(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    @Override
    public String toString() {
        return this.name() + ": price = " + price + ", color: " + this.getColor();
    }
}
