package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class TableManager {

    static Map<String, Integer> foodQty = new LinkedHashMap<>();

    /**
     * return that table ordered list
     *
     * @throws FileNotFoundException
     */
    public static void getTable(String number) throws FileNotFoundException {
        File table = new File("src/Texts/table" + number + ".txt");
        Scanner scan = new Scanner(table);
        while (scan.hasNextLine()) {
            String phrase = scan.nextLine().trim();
            String[] qty = phrase.split(";");
            if (foodQty.containsKey(qty[0])) {
                Integer newqty = foodQty.get(qty[0]) + Integer.parseInt(qty[1]);
                foodQty.put(qty[0], newqty);
            } else {
                foodQty.put(qty[0], Integer.parseInt(qty[1]));
            }
        }
        scan.close();
    }

    /**
     * return the sum of that table
     *
     * @param Map<K,V>
     * @throws FileNotFoundException 
     */
    public static double returnTotal(String number) throws FileNotFoundException {
    	getTable(number);
        double sum = 0.0;
        for (Map.Entry<String, Integer> eachfood : foodQty.entrySet()) {
            String foodname = eachfood.getKey();
            int qty = eachfood.getValue();
            sum += Menus.getthatCost(foodname) * qty;
        }
        return sum;
    }

    /**
     * sort the food quantities
     */
    public static void addtoMap(String name) {
        if (foodQty.containsKey(name)) {
            foodQty.put(name, foodQty.get(name) + 1);
        } else {
            foodQty.put(name, 1);
        }
    }

    /**
     * return the present quantity which is collected in the Map
     */
    public static Map<String, Integer> gettableQty() {
        return foodQty;
    }

    /**
     * add that dish to the list for that table
     */
    public static void addDish(String name) {
        addtoMap(name);
    }

    /**
     * writing orders out to the table text
     */
    public static void ordertoText(String number) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/Texts/table" + number + ".txt", true));
        for (Map.Entry<String, Integer> qty : foodQty.entrySet()) {
            String key = qty.getKey();
            Integer value = qty.getValue();
            bw.write(String.format("%s;%d\n", key, value));
        }
        bw.close();
        resetMap();
    }

    /**
     * reset the text back to empty
     *
     * @throws IOException
     */
    public static void resetText(String number) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/Texts/table" + number + ".txt"));
        bw.write("");
        bw.close();
    }

    /**
     * remove all Map <K,V>
     */
    public static void resetMap() {
        foodQty.clear();
    }
}
