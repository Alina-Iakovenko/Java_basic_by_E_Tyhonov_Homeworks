package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by WinDRunneR on 05.05.2016.
 */
public class Main {
    public static void main(String[] args) throws Exception {

        LinkedList<Price> prices = new LinkedList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            System.out.println("Name Of Product = ");
            String product = reader.readLine();
            System.out.println("Shop name = ");
            String shopName = reader.readLine();
            System.out.println("Price = ");
            double price = Double.parseDouble(reader.readLine());
            prices.add(new Price(product, shopName, price));
        }

        Collections.sort(prices, Price.shopNameComparator);

        System.out.println(prices.toString());

        searchProductsInTheShop(prices);


    }
        public static void searchProductsInTheShop(LinkedList <Price> a) throws Exception {
            ArrayList<String> shopsProducts = new ArrayList<>();
            String searchedShopName;

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input searched shop:");
            searchedShopName = reader.readLine();

            for (int i = 0; i < a.size(); i++) {
                String shopName = a.get(i).shopName;
                if (searchedShopName.equalsIgnoreCase(shopName)) {
                    shopsProducts.add(a.get(i).product);
                }
            }

            if (shopsProducts.size() == 0) {
                throw new Exception();
            } else {
                System.out.println(shopsProducts);}
        }
}


