package task3;

import task2.Worker;

import java.util.Comparator;

public class Price implements Comparator {
    String product;
    String shopName;
    double price;

    public Price(String product, String shopName, double price) {
        this.product = product;
        this.shopName = shopName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n" + "NameOfProduct = " + this.product + "; Shop name = " + this.shopName + "; Price = " + this.price;
    }



    public static Comparator<Price> shopNameComparator = new Comparator<Price>() {
        @Override
        public int compare(Price o1, Price o2) {
        String priceName1 = o1.shopName.toUpperCase();
        String priceName2 = o2.shopName.toUpperCase();
        return priceName1.compareTo(priceName2);
        }
    };

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
